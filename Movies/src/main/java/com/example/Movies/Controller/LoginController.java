package com.example.Movies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.Login;
import com.example.Movies.Model.Movies;
import com.example.Movies.Service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;
@CrossOrigin
@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
//	@PostMapping("/checkLogin")
//	public String validateUser(@RequestBody Login u)
//	{
//		System.out.println(u.getUsername());
//		return loginService.validateUser(u.getUsername(),u.getPassword());
//	}
	
	@PostMapping("/adduser")
	public Login saveUser(@RequestBody Login u)
	{
		return loginService.saveUser(u);
	}
	@GetMapping("/Login")
	public String login(@RequestParam String user,@RequestParam String password)
	{
		return loginService.login(user,password);
	}
	
	@PutMapping("/updateByPassword")
	public String updateByPassword(@RequestParam String password,@RequestParam String username)
	{
		int result=loginService.updateByPassword1(password, username);
		if(result>0)
		{
			return "updated";
		}
		else
		{
			return "not updated";
		}
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestParam String username,@RequestParam String password) 
	{
		loginService.deleteBy(username,password);
	}

}
