package com.example.demo;


import com.example.demo.model.adopter.Adopter;
import com.example.demo.model.adopter.AdopterBuilder;
import com.example.demo.repository.AdopterRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class AdopterTest {

    @Autowired
    AdopterRepository adopterRepository;

    @Test
    public void test() {

        AdopterBuilder adopterBuilder = new AdopterBuilder();
        Adopter adopter = adopterBuilder.startAdopterBuilder("Caio Henrique").addEmail("caio@gmail.com").addAdopterPhoneNumber(14545154L).build();
        adopterRepository.save(adopter);
        Assertions.assertNotNull(adopter);

//        Adopter adopter = new Adopter("Caio Henrique");
//        adopter.setAdopterPhoneNumber(43438328372L);
//        adopterRepository.save(adopter);
//        Assertions.assertNotNull(adopter);

    }
}
