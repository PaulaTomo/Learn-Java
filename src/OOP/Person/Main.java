package OOP.Person;

public class Main {
    public static void main(String[] args) {
        Person paulaPerson = new Person("Paula", "Tomoiaga", 31);
        System.out.println(paulaPerson.getFirstName());
        System.out.println(paulaPerson.getFullPerson());

        Employees firstEmployee = new Employees("John", "Smith", 40, 3000, "developer");
        System.out.println(firstEmployee.getFullPerson());
        System.out.println(firstEmployee.getJob());

        Employees secondEmployee = new Employees("Andrei", "Popa", 25, 2600, "Tester");
        System.out.println(secondEmployee.getFullPerson());
        System.out.println(secondEmployee.getJob());

        System.out.println(secondEmployee.getSalary());
        firstEmployee.setSalary(3900);

        System.out.println(firstEmployee.getSalary());

        User userOne = new User("Alex", "Ion", 25, "alex25", 23, 1523);
        System.out.println(userOne);
        System.out.println(userOne.getPassword());
        userOne.setPassword(23654);
        System.out.println(userOne.getPassword());

    }
}
