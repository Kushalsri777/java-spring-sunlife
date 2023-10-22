package com.dao;

import com.model.User;
import com.model.Users;

public interface UserDao {
	public Users getAllUsers();
	public void addUser(User user);
}
