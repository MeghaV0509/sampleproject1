package com.ibm.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.daoimpl.AdminDaoImpl;
import com.ibm.training.model.Movie;
import com.ibm.training.model.Theatre;

@Service
public class AdminService {

	@Autowired
	AdminDaoImpl adminDaoImpl;

	public void movieIn( Movie mv) {
		adminDaoImpl.movieInsert(mv);
	}

	public void movieDel(String id) {
		adminDaoImpl.movieDelete(id);
	}
	public void theatreIn(Theatre t) {
		adminDaoImpl.theatreInsert(t);
	}
	  
	public List<Movie> getAllMovies(){
		return adminDaoImpl.fetchAllMovie();
	}
	public void movieUpdate(Movie m) {
		adminDaoImpl.updateMovie(m);
	}
	public void updatetheatres(Theatre t) {
		adminDaoImpl.updateTheatre(t);
	}
	public List<Theatre> getAllTheatres(){
		return adminDaoImpl.fetchAllTheater();
	}
}