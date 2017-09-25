package com.xinhuamm.bond.common.logger.jdk;

import com.xinhuamm.bond.common.logger.Logger;
import com.xinhuamm.bond.common.logger.LoggerAdapter;

public class JdkLoggerAdapter implements LoggerAdapter {
	
	public Logger getLogger(String key) {
		return new JdkLogger(key);
	}

	public Logger getLogger(Class<?> clazz) {
		return new JdkLogger(clazz.getName());
	}

}
