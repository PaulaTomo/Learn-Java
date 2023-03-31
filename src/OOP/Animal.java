package OOP;

public class Animal {
    private String name;
    private int age;
    private String color;


    public Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }


    public String getFullAnimal(){
        return this.name + " is "  + this.age + " years old and is " + this.color ;
    }
    public String theAnimalEats(){
        return this.name + " eats cereals" ;
    }


}

