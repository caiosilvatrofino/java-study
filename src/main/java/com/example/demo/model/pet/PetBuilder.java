package com.example.demo.model.pet;

import com.example.demo.model.adopter.Adopter;
import com.example.demo.utils.AnimalType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

public class PetBuilder {


    private String namePet;


    private AnimalType animalType;


    private LocalDate adoptionDate;


    private String breedPet;


    private Long agePet;


    private Adopter adopter;

    public PetBuilder startPetBuilder(String namePet) {
        this.namePet = namePet;
        return this;
    }

    public PetBuilder addAnimalType(AnimalType animalType) {
        this.animalType = animalType;
        return this;
    }

    public PetBuilder addAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
        return this;
    }

    public PetBuilder addBreedPet(String breedPet) {
        this.breedPet = breedPet;
        return this;
    }

    public PetBuilder addAgePet(Long agePet) {
        this.agePet = agePet;
        return this;
    }

    public PetBuilder addAdopter(Adopter adopter) {
        this.adopter = adopter;
        return this;
    }

    public Pet build() {
        Pet pet = new Pet();
        pet.setNamePet(this.namePet);
        pet.setAnimalType(this.animalType);
        pet.setAdoptionDate(this.adoptionDate);
        pet.setBreedPet(this.breedPet);
        pet.setAgePet(this.agePet);
        pet.setAdopter(this.adopter);
        return pet;
    }

}
