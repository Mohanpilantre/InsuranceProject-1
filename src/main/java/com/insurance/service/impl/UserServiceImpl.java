package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.exception.UserNotFoundException;
import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User us = userRepository.save(user);
		return us;
	}

	@Override
	public User updateUser(User user) {
		User use = userRepository.save(user);
		return use;
	}

	@Override
	public List<User> getAllUsers(User user) {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public User getUserById(Integer id) {
		User user = userRepository.findUserById(id);
		if (user == null) {
			throw new UserNotFoundException("User id not found.");
		}
		return user;
	}

	@Override
	public String deleteUserById(Integer id) {
		 userRepository.deleteById(id);
		return "User account deleted successfully..";
	}

	@Override
	public Long getCountUser(User user) {
		Long us = userRepository.count();
		return us;
	}

}
