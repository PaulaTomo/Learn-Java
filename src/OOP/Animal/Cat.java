package OOP.Animal;

import OOP.Animal.Animal;

public class Cat extends Animal {


    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    public String animalSounds(){
        return ("The cat says meow meow");
    }
}
