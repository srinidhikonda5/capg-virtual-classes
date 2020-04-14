package com.capg.movierating.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class MovieRating{
	@Id
	private long id;
	private double rating;
	@Transient
	private int port;
	
	public MovieRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieRating(long id, double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieRating [id=" + id + ", rating=" + rating + ", port=" + port + "]";
	}
	
	
	
}
