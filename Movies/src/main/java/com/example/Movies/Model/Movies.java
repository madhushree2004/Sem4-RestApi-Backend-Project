package com.example.Movies.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movies 
{
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String relesedate;
	private String language;
	private String runningtime;
	private String category;
	private String rating;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="director_id")
	private Director director; 
	
	public Long getId() 
	{
		return id;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getRelesedate() 
	{
		return relesedate;
	}
	public void setRelesedate(String relesedate) 
	{
		this.relesedate = relesedate;
	}
	
	public String getLanguage() 
	{
		return language;
	}
	public void setlanguage(String language) 
	{
		this.language = language;
	}
	
	public String getRunningtime() 
	{
		return runningtime;
	}
	public void setRunningtime(String runningtime) 
	{
		this.runningtime = runningtime;
	}
	
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	public String getRating() 
	{
		return rating;
	}
	public void setRating(String rating) 
	{
		this.rating = rating;
	}
	
	public Director getDirector() 
	{
		return director;
	}
	public void setDirector(Director director)
	{
		this.director = director;
	}
	
}
