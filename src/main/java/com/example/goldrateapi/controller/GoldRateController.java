package com.example.goldrateapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.goldrateapi.dto.GoldRateRequest;
import com.example.goldrateapi.dto.GoldRateResponse;
import com.example.goldrateapi.service.GoldRateService;

@RestController
@RequestMapping("/gold-rates")
public class GoldRateController {
	
	private final GoldRateService service;
	public GoldRateController(GoldRateService service) {
		this.service = service;
	}
	
	
	//CREATE
	@PostMapping
	public GoldRateResponse create(@RequestBody GoldRateRequest rate) {
		return service.create(rate);
	}
	
	//READ
	@GetMapping
	public List<GoldRateResponse> getAll() {
		return service.getAll();
	}
	
	//READ BY ID
	@GetMapping("/{id}")
	public GoldRateResponse getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	//READ BY LATEST DATE
	@GetMapping("/latest")
	public GoldRateResponse getLatest() {
		return service.getLatest();
	}
	
	//UPDATE
	@PutMapping("/{id}")
	public GoldRateResponse update(@PathVariable Long id, @RequestBody GoldRateRequest rate) {
		return service.update(id, rate);
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "Deleted Successfully";
	}
	
}


















