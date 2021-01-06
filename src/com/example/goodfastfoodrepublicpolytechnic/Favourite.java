package com.example.goodfastfoodrepublicpolytechnic;

public class Favourite {

	private String name;
	private String location;
	private String number;

	
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getLocation() {
		return location;
	}
	
	public Favourite( String name, String location, String number) {
		this.name = name;
		this.number = number;
		this.location = location;


	}
}
