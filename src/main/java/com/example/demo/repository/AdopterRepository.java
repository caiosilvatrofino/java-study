package com.example.demo.repository;

import com.example.demo.model.adopter.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdopterRepository extends JpaRepository<Adopter, Long> {
    Optional<Adopter> findByAdopterNameContainingIgnoreCase(String adopterName);
}

