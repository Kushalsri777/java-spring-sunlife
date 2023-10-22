package com.controller;

import java.util.ArrayList;

import com.model.User;

public interface UserDAO {
	public boolean loginValidate(User u);
	public void addUser(User u);
	public ArrayList<User> loadAll();
	public User findUser(String uname);
	public boolean deleteUser(String uname);
	public boolean updateUser(String uname, User u);
}
