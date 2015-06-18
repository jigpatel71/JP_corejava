package com.test.logging;

import org.apache.log4j.Logger;

public class LoggerExample {

	final static Logger log = Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {

		logLevelsDemo();
	}
	
	public static void logLevelsDemo() {
		
		String methodName = "logLevelsDemo";
		
		  log.trace("Trace Message!" + methodName);
	      log.debug("Debug Message!"+ methodName);
	      log.info("Info Message!"+ methodName);
	      log.warn("Warn Message!"+ methodName);
	      log.error("Error Message!"+ methodName);
	   }
		
	}
	

