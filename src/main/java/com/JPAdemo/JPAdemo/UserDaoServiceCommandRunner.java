package com.JPAdemo.JPAdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.JPAdemo.*;
import com.JPAdemo.* ;

import ch.qos.logback.core.net.SyslogOutputStream;


@Component
public class UserDaoServiceCommandRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandRunner.class);

	@Autowired
	private UserDaoService userDaoservice;
  

	@Override
	public void run(String... args) throws Exception {
		System.out.println("******************inside10101 ");
		User user = new User("Xavi" , "Admin");
        long insert = userDaoservice.insert(user);
        log.info("*****new user is creted **********"+ user);
		 
	}

}
