package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Movies;
import com.example.Movies.Repository.MoviesRepository;

import jakarta.transaction.Transactional;

@Service
public class MoviesService {

	@Autowired
	MoviesRepository movieRepository; 
	
	public List<Movies> getAllMovies()
	{
		List<Movies> movieList=movieRepository.findAll();
		return movieList;
	}
	
	public Movies saveMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public Movies updateMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	@Transactional
	public void deleteMovies(String title)
	{
		movieRepository.deleteBy(title);
		
	}
	
	public Movies getMovies(Long id)
	{
		Movies s=movieRepository.findById(id).get();
		return s;
		
	}
	
	public List<Movies> sortMovies(String field) 
	{
		//return movieRepository.findAll(Sort.by(Direction.DESC,field));
		return movieRepository.findAll(Sort.by(field));
		
	}
	

	public List<Movies> pagingAndSortingEmployees(int offset, int pageSize, String field) 
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Movies> movie=movieRepository.findAll(paging);
		return movie.getContent();
	}

	public List<Movies> fetchMoviesByTitlePrefix(String prefix) 
	{	
		return movieRepository.findByTitleStartingWith(prefix);
	}
	
	public List<Movies> fetchMoviesByTitleSuffix(String suffix) 
	{	
		return movieRepository.findByTitleEndingWith(suffix);
	}
	
	public List<Movies> getMoviesBylanguage(String lang,String title)
	{
		return movieRepository.getMoviesBylanguage(lang,title);
	}

	public List<Movies> getMoviesBylanguage(String lang) 
	{
		return movieRepository.getMoviesBylanguage(lang);
	}

	@Transactional
	public int deleteMoviesByTitle(String title) 
	{
		return movieRepository.deleteMoviesByTitle(title);
	}

	@Transactional
	public int updateMoviesByTitle(String lang,String title) 
	{
		return movieRepository.updateMoviesByTitle(lang,title);
	}

	public List<Movies> fetchAllMovies() 
	{
		return movieRepository.findAll();
	}

	@Transactional
	public void deleteBy(String title) 
	{
		movieRepository.deleteBy(title);
	}
}
