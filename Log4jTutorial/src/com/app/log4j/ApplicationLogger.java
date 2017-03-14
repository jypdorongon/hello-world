package com.app.log4j;

import org.apache.log4j.Logger;


public class ApplicationLogger {


	private static Logger logger = Logger.getLogger(ApplicationLogger.class);
	
	
	public static Logger getInstance(){
		return logger;
	}
	
	public void logInfo(String message){
		logger.info(message);
	}

}
