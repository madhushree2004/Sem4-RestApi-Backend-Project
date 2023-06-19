/*package com.example.Movies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.Director;
import com.example.Movies.Service.DirectorService;


@RestController
public class DirectorController {
	
	@Autowired
	DirectorService directservice;
	
	@GetMapping("/getAllDirector")
	public List<Director> fetchAllDirector()
	{
		return directservice.fetchAllDirector();
	}

	@PostMapping("/saveDirector")
	public Director saveDirector(@RequestBody Director p)
	{
		return directservice.saveDirector(p);
	}

}*/
