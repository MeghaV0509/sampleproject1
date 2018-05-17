package com.ibm.training.model;


import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public
class Movie {

	private String m_id;
	private String m_name;
	private String m_date;
	private String m_time;
	public Movie(String m_id, String m_name, String m_date, String m_time) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_date = m_date;
		this.m_time = m_time;
	}
	
	public Movie() {}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_time() {
		return m_time;
	}
	public void setM_time(String m_time) {
		this.m_time = m_time;
	}
}
