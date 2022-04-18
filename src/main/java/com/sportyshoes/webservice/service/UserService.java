package com.sportyshoes.webservice.service;

import java.util.List;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.User;

public interface UserService {
	
	public User createUser(User user);
	public User updateUser(User user);
	public User getUserById(int id) throws BusinessException;
	public void deleteUserById(int id);
	
	public List<User> getAllUsers();
	public List<User> getAllUsersByName(String name);
	public List<User> getAllUsersByRole(String role);

}
