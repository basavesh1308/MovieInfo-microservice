package com.basaveshinfo.model;

public class MovieInfo {
	
	String name;
	String movieid;
	
	public MovieInfo() {}
	
	public MovieInfo(String name, String movieid) {
		super();
		this.name = name;
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	
	

}
