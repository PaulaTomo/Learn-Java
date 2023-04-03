package OOP.Animal;

public class Dog extends Animal {
    private String gender;

    public Dog(String name, int age, String color, String gender) {
        super(name, age, color);

        this.gender = gender;
    }

    @Override
    public String theAnimalEats() {
        return "The Dog eats meat";

    }

    @Override
    public String getFullAnimal() {
        return (getName() + " is "  + getAge() + "years old , is " + getColor() + " and is " + gender) ;
    }

    public String DogBarks() {
        return this.getName() + " barks";
    }
    public String animalSounds(){
        return ("The dog says woof woof");
    }
}
