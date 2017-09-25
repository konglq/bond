package com.xinhuamm.bond.registry.zk;

import com.xinhuamm.bond.remote.zk.curator.CuratorClient;

public class ZkRegistry {

	private String registryAddress;
	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}

	private CuratorClient client;
	
	public ZkRegistry() {
		client = new CuratorClient(registryAddress);
	}

	public CuratorClient getClient() {
		return client;
	}
	
}
