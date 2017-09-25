package com.xinhuamm.bond.common.logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.xinhuamm.bond.common.logger.jdk.JdkLoggerAdapter;
import com.xinhuamm.bond.common.logger.log4j.Log4jLoggerAdapter;
import com.xinhuamm.bond.common.logger.slf4j.Slf4jLoggerAdapter;

public class LoggerFactory {

	private static volatile LoggerAdapter adapter;
	
	private static final ConcurrentMap<String, Logger> LoggerMap = new ConcurrentHashMap<String, Logger>();
	
	static {
		String loggerName = System.getProperty("bond.logger", "slf4j");
		if("slf4j".equalsIgnoreCase(loggerName)) {
			adapter = new Slf4jLoggerAdapter();
		} else if("log4j".equalsIgnoreCase(loggerName)) {
			adapter = new Log4jLoggerAdapter();
		} else {
			try {
				adapter = new Slf4jLoggerAdapter();
			} catch (Exception e1) {
				try {
					adapter = new Log4jLoggerAdapter();
				} catch (Exception e2) {
					adapter = new JdkLoggerAdapter();
				}
			}
		}
	}
	
	public static Logger getLogger(String key) {
		Logger logger = LoggerMap.get(key);
		if(logger == null) {
			LoggerMap.putIfAbsent(key, adapter.getLogger(key));
			logger = LoggerMap.get(key);
		}
 		return logger;
	}
	
	public static Logger getLogger(Class<?> clazz) {
		Logger logger = LoggerMap.get(clazz.getName());
		if(logger == null) {
			LoggerMap.putIfAbsent(clazz.getName(), adapter.getLogger(clazz));
			logger = LoggerMap.get(clazz.getName());
		}
 		return logger;
	}
}
