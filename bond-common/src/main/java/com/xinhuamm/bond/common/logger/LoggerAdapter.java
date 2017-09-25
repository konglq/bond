package com.xinhuamm.bond.common.logger;

public interface LoggerAdapter {

	Logger getLogger(String key);
	
	Logger getLogger(Class<?> clazz);
}
