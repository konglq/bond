package com.xinhuamm.bond.common.logger.log4j;

import org.apache.logging.log4j.LogManager;

import com.xinhuamm.bond.common.logger.Logger;

public class Log4jLogger implements Logger {

	private org.apache.logging.log4j.Logger logger;
	
	public Log4jLogger(String key) {
		this.logger = LogManager.getLogger(key);
	}
	public void debug(String msg) {
		logger.debug(msg);
	}

	public void debug(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void error(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void error(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void error(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void info(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void info(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void info(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public boolean isTraceEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDebugEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInfoEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isWarnEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isErrorEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
