package com.basaveshinfo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basaveshinfo.model.MovieInfo;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoResource {
	
	@RequestMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId) {
		
		return new MovieInfo("Inception", movieId);
	}

}
