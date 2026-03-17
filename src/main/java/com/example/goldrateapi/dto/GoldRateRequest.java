package com.example.goldrateapi.dto;

import java.time.LocalDate;

public class GoldRateRequest {
	private LocalDate date;
	private double rate24k;
	private double rate22k;
	private String source;
	
	public GoldRateRequest() {}

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
