package com.dao;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserDaoImpl implements UserDao
{
	private static Users list=new Users();
	
	static {
		list.getUsers().add(new User(1, "SOM", "Som@mail.com", "Delhi"));
		list.getUsers().add(new User(2, "ANA", "Som@mail.com", "LA"));
		list.getUsers().add(new User(3, "Paul", "Som@mail.com", "NY"));

	}

	@Override
	public Users getAllUsers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		list.getUsers().add(user);
	}
}
