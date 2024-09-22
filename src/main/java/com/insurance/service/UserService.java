package com.insurance.service;

import java.util.List;

import com.insurance.model.User;

public interface UserService {

	public User saveUser(User user);

	public User updateUser(User user);

	public List<User> getAllUsers(User user);

	public User getUserById(Integer id);

	public String deleteUserById(Integer id);
	
	public Long getCountUser(User user);
}
