package com.example.demo.repository;

import com.example.demo.model.adopter.Adopter;
import com.example.demo.model.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Long> {


}
