package com.itos;

import org.apache.log4j.Logger;

/**
 * 
 * @author Dilanka
 *
 */
public class LoggingHelper{
	
	final static Logger logger = Logger.getLogger(LoggingHelper.class);
	
	public static void main(String[] args) {
	
		LoggingHelper obj = new LoggingHelper();
		obj.log();
		
	}
	
	private void log(){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug log..");
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info  log ...");
		}
		
		logger.warn("This is warn log ... MODIFIER");
		logger.error("This is error log... ");
		logger.fatal("This is fatal log ...");
		
	}
	
}