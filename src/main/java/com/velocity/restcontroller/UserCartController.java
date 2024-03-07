package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.servic.UserCartService;

@RestController
public class UserCartController {
	@Autowired
	private UserCartService userCartService;

// design restful web service to save one user details using another cart

	@GetMapping("/saveUser")
	public User saveUser(@RequestBody  User user) {
	User user1=	userCartService.saveUser(user);
	return user1;
	}
}
