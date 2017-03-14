package com.app.log4j;


public class Log4J {

	private static ApplicationLogger logger = new ApplicationLogger();

	public static void main(String[] args) {

		logger.logInfo("test");
	}

}
