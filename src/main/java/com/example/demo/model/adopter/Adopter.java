package com.example.demo.model.adopter;

import com.example.demo.model.pet.Pet;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "adopter")
public class Adopter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String adopterName;

    @Column(nullable = false)
    private Long adopterPhoneNumber;

    @Column(nullable = false)
    private String email;


    @OneToMany(mappedBy = "adopter", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("adopter")
    private List<Pet> pets;


    public Adopter(String adopterName) {
        this.adopterName = adopterName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public Long getAdopterPhoneNumber() {
        return adopterPhoneNumber;
    }

    public void setAdopterPhoneNumber(Long adopterPhoneNumber) {
        this.adopterPhoneNumber = adopterPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adopter adopter = (Adopter) o;
        return Objects.equals(id, adopter.id) && Objects.equals(adopterName, adopter.adopterName) && Objects.equals(adopterPhoneNumber, adopter.adopterPhoneNumber) && Objects.equals(email, adopter.email) && Objects.equals(pets, adopter.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adopterName, adopterPhoneNumber, email, pets);
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "id=" + id +
                ", adopterName='" + adopterName + '\'' +
                ", adopterPhoneNumber=" + adopterPhoneNumber +
                ", email='" + email + '\'' +
                ", pets=" + pets +
                '}';
    }
}
