package com.learning.jpa.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpademo.entity.User;
import com.learning.jpa.jpademo.service.UserDAOService;

@Component
public class UserCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log=
			LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOservice;

	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack","Admin");
		
		long insert = userDAOservice.insert(user);
		
		log.info("New user is created "+user);
		
	}

}
