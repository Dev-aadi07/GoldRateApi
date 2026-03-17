package com.example.goldrateapi.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.goldrateapi.entity.GoldRate;

public interface GoldRateRepository extends JpaRepository<GoldRate, Long>{
	Optional<GoldRate> findTopByOrderByDateDesc();
	Optional<GoldRate> findByDate(LocalDate date);
}
