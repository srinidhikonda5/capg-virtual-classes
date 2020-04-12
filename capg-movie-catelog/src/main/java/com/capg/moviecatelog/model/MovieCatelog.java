package com.capg.moviecatelog.model;

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
public class MovieCatelog {

	@Id
	private long id;
	private String movieName;
	@Transient
	public int port;
	
	public MovieCatelog(long id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "MovieCatelog [id=" + id + ", movieName=" + movieName + "]";
	}
	
}
