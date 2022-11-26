package com.example.demo.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.usermodel.User;
import com.example.demo.userrepository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;

	public User saveUserData(User u) {
		// TODO Auto-generated method stub
		return ur.save(u);
	}

	public User getUserDetails(int id) {
		// TODO Auto-generated method stub
		return ur.findById(id).get();
	}

}
