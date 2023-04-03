package OOP.Person;

public class Employees extends Person {
    private double salary;
    String job;
    public Employees(String fName, String lName, int age, double salary,String job){
        super(fName,lName,age);
        this.salary = salary;
        this.job = job;
    }
    public String getJob (){
        return this.getFirstName() + " works as a " + job;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
