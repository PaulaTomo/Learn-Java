package OOP;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person (String fName, String lName, int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
    public String getFullPerson(){
        return "The person is " +  this.firstName + " "+ this.lastName + " and is " + this.age + " years old";
    }
}
