package com.springrest.restapi.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.restapi.entities.User;

public class UserServiceImplementation implements UserService {
	
	List<User> list;
	
	public UserServiceImplementation()
	{
		list = new ArrayList<>();
		list.add(new User(1234, "asdf", 234, "IN"));
		list.add(new User(1, "asdf fdgs", 2, "US"));
	}
	@Override
	public List<User> getUsers() {
		return list;
	}

}
