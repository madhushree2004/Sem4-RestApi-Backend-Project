package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Login;

import com.example.Movies.Repository.LoginRepository;

import jakarta.transaction.Transactional;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepo;
	
	public Login saveUser(Login u) 
	{
		return loginRepo.save(u);
	}
	
//	public String validateUser(String username, String password) 
//	{
//		String result="";
//		Login u=loginRepo.findByUsername(username);
//		if(u==null)
//		{
//			result="Invalid user";
//		}
//		else
//		{
//			if(u.getPassword().equals(password))
//			{
//				result="Login success";
//			}
//			else
//			{
//				result="Login failed";
//			}
//		}
//		return result;
//	}

	public String login(String user, String password) 
	{
		List<Login> li = loginRepo.findAll();
		String res = null;
		for(Login l : li) {
			if(l.getUsername().equals(user)&&l.getPassword().equals(password)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
	
	@Transactional
	public int updateByPassword1(String password, String username) 
	{
		return loginRepo.updateByPassword(password, username);
	}
	
	@Transactional
	public void deleteBy(String username, String password) 
	{
		loginRepo.deleteBy(username,password);
	}

}


