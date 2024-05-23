package com.example.demo.model.pet;
import java.time.LocalDate;
import java.util.Objects;

import com.example.demo.utils.AnimalType;
import com.example.demo.model.adopter.Adopter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String namePet;

    @Enumerated(EnumType.STRING)
    private AnimalType animalType;

    @Column(nullable = true)
    private LocalDate adoptionDate;

    @Column(nullable = false)
    private String breedPet;

    @Column(nullable = false)
    private Long agePet;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("pets")
    private Adopter adopter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getBreedPet() {
        return breedPet;
    }

    public void setBreedPet(String breedPet) {
        this.breedPet = breedPet;
    }

    public Long getAgePet() {
        return agePet;
    }

    public void setAgePet(Long agePet) {
        this.agePet = agePet;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) && Objects.equals(namePet, pet.namePet) && animalType == pet.animalType && Objects.equals(adoptionDate, pet.adoptionDate) && Objects.equals(breedPet, pet.breedPet) && Objects.equals(agePet, pet.agePet) && Objects.equals(adopter, pet.adopter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namePet, animalType, adoptionDate, breedPet, agePet, adopter);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", namePet='" + namePet + '\'' +
                ", animalType=" + animalType +
                ", adoptionDate=" + adoptionDate +
                ", breedPet='" + breedPet + '\'' +
                ", agePet=" + agePet +
                ", adopter=" + adopter +
                '}';
    }
}
