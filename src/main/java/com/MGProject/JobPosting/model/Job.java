package com.MGProject.JobPosting.model;


public class Job {
	private String ID;
	private String title;
	private String companyName;
	private double salary;
	private String requirement;
	private String description;
	private boolean isOpen = false;
	private Address address;
	
	public Job(String title, String companyName, double salary, String requirement, String description,
			boolean isOpen, Address address) {
		this.title = title;
		this.companyName = companyName;
		this.salary = salary;
		this.requirement = requirement;
		this.description = description;
		this.isOpen = isOpen;
		this.address = new Address(address);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Address getAddress() {
		return new Address(address);
	}

	public void setAddress(Address address) {
		this.address = new Address(address);
	}
	
	
}

