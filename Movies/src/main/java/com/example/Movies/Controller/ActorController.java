/*package com.example.Movies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.Actor;
import com.example.Movies.Service.ActorService;

@RestController
public class ActorController {
	
	@Autowired
	public ActorService actorservice;
	
	@PostMapping("/saveActor")
	public Actor saveAuthor(@RequestBody Actor a)
	{
		return  actorservice.saveActor(a);
	}
	
	@GetMapping("/getAllActor")
	public List<Actor> getDetails()
	{
		return actorservice.getAllActor();
	}
	

}*/
