package com.cogknit;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogDemo{
		private static Logger logger = Logger.getLogger(LogDemo.class);

		public static void main(String[] args)
    {
			  BasicConfigurator.configure();
			  logger.setLevel(Level.WARN);

				
				logger.info("Test info");
				logger.error("Test Info");
				logger.debug("Test info");
				logger.fatal("fatal");
				System.out.println(logger.getLevel());
				System.out.println(logger.getName());
				System.out.println(logger.hashCode());
				System.out.println(logger.isDebugEnabled());
				System.out.println(logger.isInfoEnabled());
//				logger.isInfoEnabled();
				System.out.println(logger.exists("hello"));
//				logger.shutdown();
				System.out.println(logger.getRoot());
			
				

    }
}
