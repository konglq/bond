package com.xinhuamm.bond.common.logger.jdk;

import java.util.logging.Level;

import com.xinhuamm.bond.common.logger.Logger;

public class JdkLogger implements Logger {

	java.util.logging.Logger logger;

	public JdkLogger(String key) {
		this.logger = java.util.logging.Logger.getLogger(key);
	}
	public void debug(String msg) {
		logger.log(Level.FINE, msg);
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
