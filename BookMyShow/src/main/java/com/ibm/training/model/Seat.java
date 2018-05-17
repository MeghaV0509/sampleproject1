package com.ibm.training.model;



import org.springframework.stereotype.Component;

@Component
public class Seat {

	private String  seat_id;


	public Seat() {}
	
	public Seat(String seat_id) {
		super();
		this.seat_id = seat_id;
	}

	public String getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(String seat_id) {
		this.seat_id = seat_id;
	}


}