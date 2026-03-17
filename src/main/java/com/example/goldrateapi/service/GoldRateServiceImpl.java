package com.example.goldrateapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.goldrateapi.dto.GoldRateRequest;
import com.example.goldrateapi.dto.GoldRateResponse;
import com.example.goldrateapi.entity.GoldRate;
import com.example.goldrateapi.exception.ResourceNotFoundException;
import com.example.goldrateapi.repository.GoldRateRepository;

@Service
public class GoldRateServiceImpl implements GoldRateService{
	private final GoldRateRepository repo;
	
	public GoldRateServiceImpl(GoldRateRepository repo) {
		this.repo = repo;
	}
	
	private GoldRate mapToEntity(GoldRateRequest request) {
		GoldRate goldRate = new GoldRate();
		goldRate.setDate(request.getDate());
		goldRate.setRate24k(request.getRate24k());
		goldRate.setRate22k(request.getRate22k());
		goldRate.setSource(request.getSource());
		
		return goldRate;
	}
	private GoldRateResponse mapToResponse(GoldRate rate) {
		return new GoldRateResponse(rate.getId(), rate.getDate(), rate.getRate24k(), rate.getRate22k(), rate.getSource());
	}
	
	//CREATE
	@Override
	public GoldRateResponse create(GoldRateRequest goldRate) {
		GoldRate entity = mapToEntity(goldRate);
		GoldRate saved = repo.save(entity);
		return mapToResponse(saved);
	}
	
	//READ
	@Override
	public List<GoldRateResponse> getAll() {
	    return repo.findAll()
	               .stream()
	               .map(this::mapToResponse)
	               .collect(Collectors.toList());
	}
	
	//READ BY ID
	@Override
	public GoldRateResponse getById(Long id) {
		GoldRate goldRate = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Gold rate not found"));
		return mapToResponse(goldRate);
	}
	
	//READ BY LATEST DATE
	@Override
	public GoldRateResponse getLatest() {
		GoldRate goldRate = repo.findTopByOrderByDateDesc().orElseThrow(()->new ResourceNotFoundException("No data found"));
		return mapToResponse(goldRate);
	}
	
	//UPDATE
	@Override
	public GoldRateResponse update(Long id, GoldRateRequest goldRate) {
		GoldRate existing = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Gold rate not found"));
		
		existing.setDate(goldRate.getDate());
		existing.setRate22k(goldRate.getRate22k());
		existing.setRate24k(goldRate.getRate24k());
		existing.setSource(goldRate.getSource());
		GoldRate updated = repo.save(existing);
		
		return mapToResponse(updated);
	}
	
	
	//DELETE
	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
















