package com.xinhuamm.bond.common.logger.log4j;

import com.xinhuamm.bond.common.logger.Logger;
import com.xinhuamm.bond.common.logger.LoggerAdapter;

public class Log4jLoggerAdapter implements LoggerAdapter{

	public Logger getLogger(String key) {
		return new Log4jLogger(key);
	}

	public Logger getLogger(Class<?> clazz) {
		return new Log4jLogger(clazz.getName());
	}

}
