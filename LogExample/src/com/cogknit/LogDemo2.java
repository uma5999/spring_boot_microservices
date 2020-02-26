package com.cogknit;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogDemo2{
		private static Logger log = Logger.getLogger(LogDemo2.class);

		public static void main(String[] args)
    {
			System.out.println("in main class");
			  BasicConfigurator.configure();
			  log.setLevel(Level.OFF);

				//all
			  log.debug("Log4j debug message test.");
			  log.info("Log4j info message test.");
			  log.warn("Log4j warn message test.");
			  log.error("Log4j error message test.");
			  log.fatal("Log4j fatal message test.");
			  //off
				

    }
}
