package com.cognizant.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.DAO.UserDAO;
import com.cognizant.project.entity.ManageUser;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserDAO userDAO;
	@Override
	@Transactional
	public List<ManageUser> getAllUsers() {
		return userDAO.getAllUsers();
		
	}

}
