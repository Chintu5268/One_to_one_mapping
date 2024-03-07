package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User;
import com.velocity.repository.UserCartRepository;
import com.velocity.servic.UserCartService;

@Service
public class UserServiceImpl implements UserCartService {

	@Autowired
	private UserCartRepository userCartRepository;
	@Override
	public User saveUser(User user) {
		User  user1 =userCartRepository.save(user);
		return user1;
	}

	


}
