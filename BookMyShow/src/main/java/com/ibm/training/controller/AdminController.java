package com.ibm.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.model.Movie;
import com.ibm.training.model.Theatre;
import com.ibm.training.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService aservice;


	@RequestMapping("/insert")

	public Movie insertMovie(@RequestBody Movie mv) {
		 aservice.movieIn(mv);
		 return mv; 
	 }

	@RequestMapping("/delete/{id}")
	
	public void deleteMovie(@PathVariable ("id") String id) {
		aservice.movieDel(id);
		System.out.println("Movie deleted");
	}
	
	@RequestMapping("/insert/theatre")
	public Theatre insertTheatre(@RequestBody Theatre t) {
		aservice.theatreIn(t);
		return t;
	}
	
	
	@RequestMapping("/getallmovies")
	public List<Movie> findAllMovies(){
		return aservice.getAllMovies();
	}
	
	@RequestMapping("/getalltheatres")
	public List<Theatre> findAlltheatres(){
		return aservice.getAllTheatres();
	}
	
	@RequestMapping("/update")
	public void editMovie(@RequestBody Movie m) {
		aservice.movieUpdate(m);
		System.out.println("Movie updated");
	}
	
	@RequestMapping("/update/theatre")
	public Theatre updateth(@RequestBody Theatre t) {
	aservice.updatetheatres(t);
		return t; 
	 }   
}