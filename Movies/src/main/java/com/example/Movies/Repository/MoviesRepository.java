package com.example.Movies.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.Movies;

@Repository

public interface MoviesRepository extends JpaRepository<Movies,Long>
{
	     @Modifying
	     @Query("delete from Movies s where s.title=?1")
	     public int deleteBy(String title);
	
	    //positional parameter
		@Query("select s from Movies s where s.language=?1 and s.title=?2")
		public List<Movies> getMoviesBylanguage(String lang,String title);
		
		//named parameter
		@Query("select s from Movies s where s.language=:lang")
		public List<Movies> getMoviesBylanguage(String lang);
		
		//DML parameter
		@Modifying
		@Query("delete from Movies s where s.title=?1")
		public int deleteMoviesByTitle(String title);
		
		@Modifying
		@Query("update Movies s set s.language=?1 where s.title=?2")
		public int updateMoviesByTitle(String lang,String title);
			
		List<Movies> findByTitleStartingWith(String prefix);
		List<Movies> findByTitleEndingWith(String suffix);
		List<Movies> findBylanguage(String lang);
}

