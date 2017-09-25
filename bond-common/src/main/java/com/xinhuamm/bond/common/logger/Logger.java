package com.xinhuamm.bond.common.logger;

public interface Logger {

	void debug(String msg);
	
	void debug(Throwable t);
	
	void debug(String msg, Throwable t);
	
	void error(String msg);
	
	void error(Throwable t);
	
	void error(String msg, Throwable t);
	
	void info(String msg);
	
	void info(Throwable t);
	
	void info(String msg, Throwable t);
	
	void warn(String msg);
	
	void warn(Throwable t);
	
	void warn(String msg, Throwable t);
	
	void trace(String msg);
	
	void trace(Throwable t);
	
	void trace(String msg, Throwable t);
	
	boolean isTraceEnable();
	
	boolean isDebugEnable();
	
	boolean isInfoEnable();
	
	boolean isWarnEnable();
	
	boolean isErrorEnable();
	
	String getName();
}
