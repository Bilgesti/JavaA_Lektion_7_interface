package com.bilgee.Lektion_7;

import models.Cat;
import models.Dog;
import models.Squirrel;

public class Main {
    public static void main(String[] args) {
        // Instantiate Objects
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();


        benny.eat();        // Abstract Method - Implementation
        benny.makeSound();  // Ordinary Method

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("Cat");

        fido.name();
        fido.eat();
        fido.move();
        fido.sleep();
        fido.makeSound();
        fido.typeOfAnimal("Dog");
    }
}
