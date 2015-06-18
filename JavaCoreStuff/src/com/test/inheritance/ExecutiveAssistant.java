package com.test.inheritance;

import org.apache.log4j.Logger;

import com.test.logging.LoggerExample;

public class ExecutiveAssistant extends BaseEmployee {
	
	final static Logger log = Logger.getLogger(ExecutiveAssistant.class);

	// specific behavior
	public void manageAppointments() {
		log.debug("In manageAppointments()");
		System.out.println(" ExecAssitant Manage Appointments");
	}
	
	public void adviseExecutives() {
		log.debug("In adviseExecutives()");
		System.out.println("ExecAssitant Advise Appointments");
	}
	
}
