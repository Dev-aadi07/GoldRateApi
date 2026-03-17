package com.example.goldrateapi.dto;

import java.time.LocalDate;

public class GoldRateResponse {
	private Long id;
	private LocalDate date;
	private double rate24k;
	private double rate22k;
	private String source;
	
	public GoldRateResponse(Long id, LocalDate date, double rate24k, double rate22k, String source) {
		this.id = id;
		this.date = date;
		this.rate24k = rate24k;
		this.rate22k = rate22k;
		this.source = source;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getRate24k() {
		return rate24k;
	}

	public double getRate22k() {
		return rate22k;
	}

	public String getSource() {
		return source;
	}

}
