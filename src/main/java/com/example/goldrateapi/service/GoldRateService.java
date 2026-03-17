package com.example.goldrateapi.service;

import java.util.List;

import com.example.goldrateapi.entity.GoldRate;

public interface GoldRateService {
	
	GoldRate create(GoldRate goldRate);
	
	List<GoldRate> getAll();
	
	GoldRate getById(Long id);
	
	GoldRate getLatest();
	
	GoldRate update(Long id, GoldRate goldRate);
	
	void delete(Long id);
	
}
