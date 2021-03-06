package com.sportyshoes.webservice.implementation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.User;
import com.sportyshoes.webservice.repository.UserRepository;
import com.sportyshoes.webservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public User getUserById(int id) throws BusinessException {
		User user = null;
		try {
			if (id <= 0) {
				throw new BusinessException("ID cannot be zero or negative");
			}	
			user = repository.findById(id).get();
		} catch(NoSuchElementException e) {
			throw new BusinessException("No User found with id = " + id);
		}
		return user;
	}

	@Override
	public void deleteUserById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public List<User> getAllUsersByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<User> getAllUsersByRole(String role) {
		return repository.findByRole(role);
	}

}
