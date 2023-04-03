package OOP.Car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A4", 2008, "grey","diesel");
        System.out.println(audi.getFullInfo());
        audi.setColor("black");
        System.out.println(audi.getFullInfo());
    }


}
