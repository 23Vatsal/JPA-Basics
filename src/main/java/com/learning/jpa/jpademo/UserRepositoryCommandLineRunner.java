package com.learning.jpa.jpademo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpademo.entity.User;
import com.learning.jpa.jpademo.service.UserDAOService;
import com.learning.jpa.jpademo.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log=
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jill","Admin");
		
		userRepository.save(user);
		
		log.info("New user is created "+user);
		
		Optional<User> findByIdOne = userRepository.findById(1L);
		
		log.info("User retrieved "+findByIdOne);
		
		List<User> findAll = userRepository.findAll();
		
		log.info("All users are "+findAll);
		
	}

}
