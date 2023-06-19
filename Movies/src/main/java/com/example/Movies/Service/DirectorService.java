/*package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Director;
import com.example.Movies.Repository.DirectorRepository;

@Service
public class DirectorService {
	
	@Autowired
	DirectorRepository directRepository;

	public List<Director> fetchAllDirector() 
	{
		return directRepository.findAll();
	}

	public Director saveDirector(Director p) 
	{
		return directRepository.save(p);
	}

}*/
