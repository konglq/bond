package com.xinhuamm.bond.container.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xinhuamm.bond.common.logger.Logger;
import com.xinhuamm.bond.common.logger.LoggerFactory;

public class SpringMain {
	
	Logger logger = LoggerFactory.getLogger(SpringMain.class);

	public static final String DEFAULT_SPRING_CONFIG = "classpath*:spring/*.xml";
	static ClassPathXmlApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(DEFAULT_SPRING_CONFIG.split("[,\\s]+"));
		context.start();
	}
	
	public void stop() {
        try {
            if (context != null) {
                context.stop();
                context.close();
                context = null;
            }
        } catch (Throwable e) {
            logger.error(e.getMessage(), e);
        }
    }
}
