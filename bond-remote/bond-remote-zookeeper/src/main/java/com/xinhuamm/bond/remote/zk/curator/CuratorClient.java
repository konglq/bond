package com.xinhuamm.bond.remote.zk.curator;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

public class CuratorClient {

	private CuratorFramework cf;
	private String registryAddress;
	
	
	public CuratorClient(String registryAddress) {
		this.registryAddress = registryAddress;
		init();
	}
	
	private void init() {
		RetryPolicy policy = new ExponentialBackoffRetry(2000, 3);
		cf = CuratorFrameworkFactory.builder()
				.connectString(registryAddress)
				.retryPolicy(policy)
				.namespace("xh_bond")
				.build();
		cf.start();
	}
	
	/**
	 * 没有设置节点属性，节点创建模式默认为持久化节点，内容默认为空
	 * @param path
	 * @throws Exception
	 */
	public void createNode(String path) throws Exception {
		cf.create().forPath(path);
	}
	
	/**
	 * 
	 * @param path
	 * @param mode 
	 * 为null时，创建持久节点
	 * @throws Exception
	 */
	public void createNode(String path, CreateMode mode) throws Exception {
		if(mode == null) {
			createNode(path);
		} else {
			cf.create().withMode(mode).forPath(path);
		}
	}
	
	/**
	 * 
	 * @param path
	 * @param mode 
	 *  为null时，创建持久节点
	 * @param isCreateParentContainers 
	 * true：创建父节点；
	 * false：父节点不存在抛出NoNodeException；
	 * @throws Exception
	 */
	public void createNode(String path, CreateMode mode, boolean isCreateParentContainers) throws Exception {
		if(isCreateParentContainers) {
			cf.create().creatingParentContainersIfNeeded().withMode(mode).forPath(path);
		} else {
			cf.create().withMode(mode).forPath(path);
		}
	}
}
