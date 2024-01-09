package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOYS")
public class Toy {
	@Id
	@Column(name = "TOY_ID")
	private int toyID;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "FACTORY_PRICE") 
	private double factoryPrice;
	
	@Column(name = "RATING")
	private double rating;
	
	public Toy(int toyID, String name, double factoryPrice, double rating) {
		super();
		this.toyID = toyID;
		this.name = name;
		this.factoryPrice = factoryPrice;
		this.rating = rating;
	}
	public int getToyID() {
		return toyID;
	}
	public void setToyID(int toyID) {
		this.toyID = toyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFactoryPrice() {
		return factoryPrice;
	}
	public void setFactoryPrice(double factoryPrice) {
		this.factoryPrice = factoryPrice;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Toy [toyID=" + toyID + ", name=" + name + ", factoryPrice=" + factoryPrice + ", rating=" + rating + "]";
	}
	
	
}
