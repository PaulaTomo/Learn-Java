package OOP.Animal;

public class Main {
    public static void main(String[] args) {

        Cat kitty = new Cat("Kitty", 2, "white");
        System.out.println(kitty.getFullAnimal());
        System.out.println(kitty.theAnimalEats());
        System.out.println(kitty.getName());
        kitty.setAge(3);
        System.out.println(kitty.getAge());
        System.out.println(kitty.animalSounds());

        Dog max = new Dog("Max", 2, "black","male");
        System.out.println(max.getFullAnimal());
        System.out.println(max.theAnimalEats());
        System.out.println(max.DogBarks());
        System.out.println(max.animalSounds());
    }
}
