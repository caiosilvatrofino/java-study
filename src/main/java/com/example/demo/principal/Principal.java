package com.example.demo.principal;

import com.example.demo.repository.AdopterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Scanner;

public class Principal {

    @Autowired
    AdopterRepository adopterRepository;

    private Scanner read = new Scanner(System.in);


    public void showMenu() {
        var menu = """
                1 - Find Adopter
                2 - Find Pet
                
                0 - Exit
                """;

        System.out.println(menu);
        var option = read.nextInt();
        read.nextLine();


        switch (option) {
            case 1:
                foundAdopter();
                break;
//            case 2:
//                foundPet();
//                break;
            default:
                System.out.println("Invalid option! Try again.");
        }

    }

    private void foundAdopter() {
        System.out.println("What is adopterName?");
        var adopterName = read.nextLine();
        Optional result = adopterRepository.findByAdopterNameContainingIgnoreCase(adopterName);
        System.out.println(result);
    }
}
