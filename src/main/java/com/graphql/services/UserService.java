package com.graphql.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.entities.User;
import com.graphql.helper.ExceptionHelper;
import com.graphql.repositories.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	// Creating user
	public User createUser(User user) {
		return userRepo.save(user);
	}

	// getting all users
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	// getting single user
	public User getUser(int userId) {
		User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		return user;
	}

	// deleting user
	public boolean deleteUser(int userId) {
		User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		userRepo.delete(user);
		return true;

	}
	// updating user

}
