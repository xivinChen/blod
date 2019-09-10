package com.blod.service;

import java.util.List;

import com.blod.entity.User;

public interface UserService {

	List<User> getAllUser(User tbUser);

	User getUserByUsername(String username, String password);

}
