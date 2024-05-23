package com.example.demo;


import com.example.demo.model.adopter.Adopter;
import com.example.demo.model.pet.Pet;
import com.example.demo.model.pet.PetBuilder;
import com.example.demo.repository.PetRepository;
import com.example.demo.utils.AnimalType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PetTest {

    @Autowired
    private PetRepository petRepository;

    @Test
    public void test() {
        PetBuilder petBuilder = new PetBuilder();
        Pet pet = petBuilder.startPetBuilder("Amora").addAnimalType(AnimalType.CAT).addAgePet(5L).addBreedPet("SRD").build();
        petRepository.save(pet);
        Assertions.assertNotNull(pet);
    }
}
