package com.example.goldrateapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.goldrateapi.entity.GoldRate;
import com.example.goldrateapi.repository.GoldRateRepository;

@Service
public class GoldRateServiceImpl implements GoldRateService{
	private final GoldRateRepository repo;
	
	public GoldRateServiceImpl(GoldRateRepository repo) {
		this.repo = repo;
	}
	
	//CREATE
	@Override
	public GoldRate create(GoldRate goldRate) {
		return repo.save(goldRate);
	}
	
	//READ
	@Override
	public List<GoldRate> getAll() {
		return repo.findAll();
	}
	
	//READ BY ID
	@Override
	public GoldRate getById(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Gold Rate Not Found"));
	}
	
	//READ BY LATEST DATE
	@Override
	public GoldRate getLatest() {
		return repo.findTopByOrderByDateDesc().orElse(null);
	}
	
	//UPDATE
	@Override
	public GoldRate update(Long id, GoldRate goldRate) {
		GoldRate existing = repo.findById(id).orElseThrow();
		
		existing.setDate(goldRate.getDate());
		existing.setRate22k(goldRate.getRate22k());
		existing.setRate24k(goldRate.getRate24k());
		existing.setSource(goldRate.getSource());
		
		return repo.save(existing);
	}
	
	
	//DELETE
	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
















