/*package com.example.Movies.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Actor 
{
	@Id
	private int Actorid;
	private String Actorname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="actor_movies")
	private List<Movies> moviesInfo;
	
	public int getActorid() 
	{
		return Actorid;
	}
	public void setActorid(int actorid) 
	{
		Actorid = actorid;
	}
	public String getActorname() 
	{
		return Actorname;
	}
	public void setActorname(String actorname) 
	{
		Actorname = actorname;
	}
	public List<Movies> getMoviesInfo() 
	{
		return moviesInfo;
	}
	public void setMoviesInfo(List<Movies> moviesInfo) 
	{
		this.moviesInfo = moviesInfo;
	}

	
}*/
