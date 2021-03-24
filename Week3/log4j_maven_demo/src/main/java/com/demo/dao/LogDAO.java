package com.demo.dao;

import org.apache.log4j.Logger;

public class LogDAO {
	private static Logger log = Logger.getLogger(LogDAO.class);
	public void helloLogDAO() {
		log.debug("hello from LogDAO");
		//some operations in logdao
		log.info("hello to customer from LogDAO");
		log.debug("bye bye from LogDAO");
		
	}
}
