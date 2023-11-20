package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDAO;
import com.model.User;

@Service
public class UserDaoImpl implements UserDAO{
	
	@Autowired
	AppDAO appDAO;
	
	ArrayList<User> al = new ArrayList<>();
	@Override
	public boolean loginValidate(User u) {
		for(User i : al) {
			if(i.getUname().equals(u.getUname()) && i.getPassword().equals(u.getPassword())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void addUser(User u) {
//		al.add(u);
		appDAO.save(u);
		
	}
	@Override
	public ArrayList<User> loadAll() {
//		return al;
		return (ArrayList<User>)appDAO.findAll();
	}
	@Override
	public User findUser(int uid) {
		Optional<User>op=appDAO.findById(uid);
		return op.get();
	}
	@Override
	public boolean deleteUser(String uname) {
		// TODO Auto-generated method stub
		int idx = -1;
		for(int i=0; i<al.size(); i++) {
			if(al.get(i).getUname().equals(uname)) {
				idx=i;
				break;
			}
		}
		if(idx==-1)
			return false;
		al.remove(idx);
		return true;
		
	}
	@Override
	public boolean updateUser(String uname, User u) {
		// TODO Auto-generated method stub
		int idx =-1;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getUname().equals(uname)) {
				idx=i;
				break;
			}
		}
		if(idx == -1)return false;
		al.set(idx, u);
		return true;
	}

}
