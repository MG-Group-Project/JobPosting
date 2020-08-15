package com.MGProject.JobPosting.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Address {
	
	private String ID;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	public Address() {
		
	}
	
	public Address( String city, String state, String zipcode, String country) {
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	
	// copy constructor 
	public Address(Address address) {
		this.city = address.city;
		this.state = address.state;
		this.zipcode = address.zipcode;
		this.country = address.country;
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}	
}
