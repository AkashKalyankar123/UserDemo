package com.user.demo.services;

import java.util.List;

import com.user.demo.entity.User;

public interface UsersService {

	User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
	
}
