package com.example.Movies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.UserDetails;
import com.example.Movies.Service.UserService;
@CrossOrigin
@RestController
public class UserController 
{
	 @Autowired
		UserService us;
	    
	    @GetMapping("/getuser")
	    public List<UserDetails> getUserDetail()
	    {
	    	return us.getUserDetail();
	    }
	    
	    
	    @PostMapping("/saveuser")
	    public UserDetails saveUserDetail(@RequestBody UserDetails u)
	    {
	    	return us.saveUserDetail(u);
	    }
}

