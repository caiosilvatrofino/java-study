package com.example.demo.model.adopter;

import com.example.demo.model.pet.Pet;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

public class AdopterBuilder {


    private String adopterName;


    private Long adopterPhoneNumber;


    private String email;


    private List<Pet> pets;

    public AdopterBuilder startAdopterBuilder(String adopterName) {
        this.adopterName = adopterName;
        return this;
    }

    public AdopterBuilder addAdopterPhoneNumber(Long adopterPhoneNumber) {
        this.adopterPhoneNumber = adopterPhoneNumber;
        return this;
    }

    public AdopterBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    public AdopterBuilder addPet(List<Pet> pets) {
        this.pets = pets;
        return this;
    }

    public Adopter build() {
        Adopter adopter = new Adopter(this.adopterName);
        adopter.setAdopterPhoneNumber(this.adopterPhoneNumber);
        adopter.setEmail(this.email);
        adopter.setPets(this.pets);
        return adopter;
    }
}
