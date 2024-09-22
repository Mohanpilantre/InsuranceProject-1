package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.model.User;
import com.insurance.service.PolicyService;
import com.insurance.service.PremiumDetailsService;
import com.insurance.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name ="User")
public class UserPolicyPremiumController {

	@Autowired
	UserService userService;

	@Autowired
	PolicyService policyService;

	@Autowired
	PremiumDetailsService pDetailsService;

	@PostMapping("/saveUser")
	@Operation(summary = "Save the user policy premium Details")
	public User saveUser(@RequestBody User user) {
		User u = userService.saveUser(user);
		List<Policy> list = user.getPolicyList();
		for (Policy policy : list) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return u;
	}

	@PutMapping("/updateUser")
	@Operation(summary = "Update the user policy premium details")
	public User updateUser(@RequestBody User user) {
		User u = userService.updateUser(user);
		List<Policy> list = user.getPolicyList();
		for (Policy policy : list) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return u;
	}

	@GetMapping("/getAllUsers")
	@Operation(summary = "Get all users")
	public List<User> getAllUsers(User user) {
		List<User> list = userService.getAllUsers(user);
		return list;
	}

	@GetMapping("/getUserById/{id}")
	@Operation(summary = "Get the user by user id")
	public User getUserById(@PathVariable("id") Integer id) {
		User user = userService.getUserById(id);
		return user;
	}

	@GetMapping("/deleteUserById/{id}")
	@Operation(summary = "Delete user by user id")
	public String deleteUserById(@PathVariable("id") Integer id) {
		String str = userService.deleteUserById(id);
		return str;
	}

	@GetMapping("/getCountUser")
	@Operation(summary = "Get total count of users")
	public Long getCountUser(User user) {
		Long l = userService.getCountUser(user);
		return l;
	}
}
