package com.ibm.training.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.daoimpl.UserDaoImpl;
import com.ibm.training.model.Booking;
import com.ibm.training.model.Login;
import com.ibm.training.model.Movie;
import com.ibm.training.model.Theatre;



@Service
public class UserService {
	@Autowired
	UserDaoImpl userDaoImpl;

	public void signUpUser( Login l) {
		userDaoImpl.signupUser(l);
	}

	public Collection<Movie> findAllMovies(){
		return userDaoImpl.getAllMovies();
	}

	public List<Theatre> theatreFind(String id) {
		return userDaoImpl.findTheatre(id);
	}
	
	public void insertBooking(Booking b) {
		userDaoImpl.bookTicket(b);
	}
}