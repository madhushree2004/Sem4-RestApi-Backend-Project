package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Login;
import com.example.Movies.Model.UserDetails;
import com.example.Movies.Repository.LoginRepository;
import com.example.Movies.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	@Autowired
	LoginRepository lr;
	
	public List<UserDetails> getUserDetail()
	{
		return ur.findAll();
	}

	public UserDetails saveUserDetail(UserDetails u)
	{
		String us = u.getFirstname();
		String pass = u.getPassword();
		Login log = new Login();
		log.setUsername(us);
		log.setPassword(pass);
		lr.save(log);
		return ur.save(u);
	}
	
}

