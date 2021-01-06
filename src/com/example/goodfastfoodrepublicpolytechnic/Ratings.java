package com.example.goodfastfoodrepublicpolytechnic;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Ratings implements Serializable{
	private int id;
	private String canteenName;
	private String storeName;
	private String name;
	private String review;
	private int stars;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCanteenName() {
		return canteenName;
	}
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	// Simple list calls this to get the content to display
	@Override
	public String toString() {
		return name + " " + review;
	}
	public Ratings(int id, String canteenName, String storeName, String name, String review, int stars) {
		this.id = id;
		this.canteenName = canteenName;
		this.storeName = storeName;
		this.name = name;
		this.review = review;
		this.stars = stars;
	}
}
