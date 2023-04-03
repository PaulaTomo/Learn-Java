package OOP.Car;

public class Car {
    private String name;
    private String model;
    private int year;
    private String color;
    private String engine;

    public Car(String name, String model, int year, String color,String engine) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String engineCar() {
        return engine;
    }

    public String getFullInfo(){
        return ("Name: " + this.name + "\nmodel: " + this.year + "\ncolor: " + this.color);
    }
    }

