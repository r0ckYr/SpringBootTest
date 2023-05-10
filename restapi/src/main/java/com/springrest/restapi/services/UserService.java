package com.springrest.restapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.restapi.entities.User;

@Service
public interface UserService {
	public List<User> getUsers();
}
