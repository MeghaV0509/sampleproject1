package com.ibm.training.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;



@SuppressWarnings("serial")
@Component
public class Booking implements Serializable{

	
	private String b_name;
	private int b_id;
	private int tt_id;
	public Booking(String b_name, int b_id, int tt_id) {
		super();
		this.b_name = b_name;
		this.b_id = b_id;
		this.tt_id = tt_id;
	}
	public Booking() {}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getTt_id() {
		return tt_id;
	}
	public void setTt_id(int tt_id) {
		this.tt_id = tt_id;
	}
}
