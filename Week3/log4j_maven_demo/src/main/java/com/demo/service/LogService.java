package com.demo.service;

import org.apache.log4j.Logger;

import com.demo.dao.LogDAO;

public class LogService {

	private static Logger log = Logger.getLogger(LogService.class);

	private LogDAO dao = new LogDAO();

	public void helloLogService() {
		log.debug("hello from LogService");
		log.info("hello to customer from LogService");
		dao.helloLogDAO();
		log.debug("bye bye from LogService");
	}
}
