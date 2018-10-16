package com.mkyong.common.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(WelcomeAction.class);

	public String execute() throws Exception {

		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("execute()!");
		}

		// logs exception
		logger.error("This is Error message", new Exception("Testing"));

		return SUCCESS;

	}
}