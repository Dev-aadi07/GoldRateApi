package com.example.goldrateapi.service;

import java.util.List;

import com.example.goldrateapi.dto.GoldRateRequest;
import com.example.goldrateapi.dto.GoldRateResponse;

public interface GoldRateService {
	
	GoldRateResponse create(GoldRateRequest goldRate);
	
	List<GoldRateResponse> getAll();
	
	GoldRateResponse getById(Long id);
	
	GoldRateResponse getLatest();
	
	GoldRateResponse update(Long id, GoldRateRequest goldRate);
	
	void delete(Long id);
	
}
