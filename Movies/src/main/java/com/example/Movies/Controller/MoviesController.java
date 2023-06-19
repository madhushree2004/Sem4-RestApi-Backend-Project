package com.example.Movies.Controller;

import java.util.List;

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

import com.example.Movies.Model.Movies;
import com.example.Movies.Service.MoviesService;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
public class MoviesController {

	@Autowired
	MoviesService movieService;
	
	@Tag(name="Get",description="get data")
	@GetMapping(value="fetchMovies")
	public List<Movies> getAllMovies()
	{
		List<Movies> movieList=movieService.getAllMovies();
		return movieList;
	}
	
	@Tag(name="Post",description="post data")
	@PostMapping(value="/saveMovies")
	public Movies saveMovies(@RequestBody Movies m)
	{
		return movieService.saveMovies(m);
	}
	
	@Tag(name="Put",description="put data")
	@PutMapping(value="/updateMovies")
	public Movies updateMovies(@RequestBody Movies m)
	{
		return movieService.saveMovies(m);
		
	}
	
	//@Tag(name="Delete",description="delete data")
	
	@DeleteMapping("/deleteMovies")
	public void delete(@RequestParam String title) 
	{
		movieService.deleteBy(title);
	}
	/*@DeleteMapping(value="/deleteMovies/{title}")
	public void  deleteMovies(@PathVariable("title") String title)
	{
		movieService.deleteMovies(title);
	}*/
	
	@GetMapping(value="/getMovies/{id}")
	public Movies getMovies(@PathVariable("id") Long id)
	{
		return movieService.getMovies(id);
	}
	
	@GetMapping("/sortMovies/{field}")
    public List<Movies> sortMovies(@PathVariable String field)
    {
	   return movieService.sortMovies(field);
    }
	
	@GetMapping("/pagingAndSortingMovies/{offset}/{pageSize}/{field}")
    public List<Movies> pagingAndSortingEmployees(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
    {
	    return movieService.pagingAndSortingEmployees(offset, pageSize, field);
    }
	
	 @GetMapping("/fetchMoviesByTitlePrefix")
	 public List<Movies> fetchMoviesByTitlePrefix(@RequestParam String prefix)
	 {
	    return movieService.fetchMoviesByTitlePrefix(prefix);
     }
	 
	 @GetMapping("/fetchMoviesByTitleSuffix")
	 public List<Movies> fetchMoviesByTitleSuffix(@RequestParam String suffix)
	 {
	    return movieService.fetchMoviesByTitleSuffix(suffix);
     }
	 
	 @GetMapping("/fetchMoviesBylanguage/{lang}/{title}")
	 public List<Movies> fetchMoviesBylanguage(@PathVariable String lang,@PathVariable String title)
	 {
	    return movieService.getMoviesBylanguage(lang,title);
	 }
	 
	 @GetMapping("/fetchMoviesBylanguage/{lang}")
	 public List<Movies> fetchMoviesBylanguage(@PathVariable String lang)
	 {
	    return movieService.getMoviesBylanguage(lang);
	 }
	 
	 @DeleteMapping("/deleteMoviesByTitle/{title}")
	 public String deleteMoviesByTitle(@PathVariable String title)
	 {
		 int result=movieService.deleteMoviesByTitle(title);
	        if(result >0)
	        {
	    	   return "Movies record deleted";
	        }
	        else
	        {
	    	   return "Problem occured while deleting";
	        }
	 }
	 
	 @PutMapping("/updateMoviesByTitle")
	 public String updateMoviesByTitle(@RequestParam String lang,@RequestParam String title)
	 {
		 int result=movieService.updateMoviesByTitle(lang,title);
	     if(result >0)
	     {
	         return "updated";
	     }
	     else
	     {
	    	 return "not updated";
	     }
	 }
	 
	 @GetMapping("/getAllMovies")
	 public List<Movies> fetchAllMovies()
	 {
		return movieService.fetchAllMovies();
	 }
}
