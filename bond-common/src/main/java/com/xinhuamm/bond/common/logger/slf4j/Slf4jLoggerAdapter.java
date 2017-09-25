package com.xinhuamm.bond.common.logger.slf4j;

import com.xinhuamm.bond.common.logger.Logger;
import com.xinhuamm.bond.common.logger.LoggerAdapter;

public class Slf4jLoggerAdapter implements LoggerAdapter {
	
	public Logger getLogger(String key) {
		return new Slf4jLogger(key);
	}

	public Logger getLogger(Class<?> clazz) {
		return	new Slf4jLogger(clazz.getName());
	}

}
