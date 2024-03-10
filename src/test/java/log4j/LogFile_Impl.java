package log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogFile_Impl {
	
	public Logger log = LogManager.getLogger(LogFile_Impl.class.getName());
	@Test
	public void print() {
		log.debug("i am from debug");
		log.error("i am from error");
		log.info("i am from info");
		log.fatal("i am from fatal===");
		System.out.println("we are done");
	}

}
