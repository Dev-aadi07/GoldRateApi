package com.example.goldrateapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GoldRate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate date;
	private double rate24k;
	private double rate22k;
	private String source;
	
	public GoldRate() {}
	
	public GoldRate(Long id, LocalDate date, double rate24k, double rate22k, String source) {
		this.id = id;
		this.date = date;
		this.rate24k = rate24k;
		this.rate22k = rate22k;
		this.source = source;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getRate24k() {
		return rate24k;
	}

	public void setRate24k(double rate24k) {
		this.rate24k = rate24k;
	}

	public double getRate22k() {
		return rate22k;
	}

	public void setRate22k(double rate22k) {
		this.rate22k = rate22k;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	
}
