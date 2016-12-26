package king;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4JDemo.class);
		PropertyConfigurator.configure("src/log4j.properties");
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
//		logger.setLevel(Level.WARN ); //强制logger级别
		logger.error("error");
		logger.warn("warn");
		logger.info("info");
		logger.debug("debug");
	}

}
