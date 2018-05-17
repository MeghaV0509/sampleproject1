package com.ibm.training.model;



import org.springframework.stereotype.Component;

@Component
public class Tickets {

	private String tic_no;
	private String no_of_tickets;
	private String tic_status;
	private String b_id;
	public String getTic_no() {
		return tic_no;
	}
	public void setTic_no(String tic_no) {
		this.tic_no = tic_no;
	}
	public String getNo_of_tickets() {
		return no_of_tickets;
	}
	
	public void setNo_of_tickets(String no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	public String getTic_status() {
		return tic_status;
	}
	public void setTic_status(String tic_status) {
		this.tic_status = tic_status;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public Tickets(String tic_no, String no_of_tickets, String tic_status, String b_id) {
		super();
		this.tic_no = tic_no;
		this.no_of_tickets = no_of_tickets;
		this.tic_status = tic_status;
		this.b_id = b_id;
	}
	public Tickets() {}
}
