package OOP;

public class MainClass {
    public static void main(String[] args) {

        //OOP
        Person paulaPerson = new Person("Paula", "Tomoiaga", 31);
        System.out.println(paulaPerson.firstName);
        System.out.println(paulaPerson.getFullPerson());
        Employees firstEmployee = new Employees("John","Smith",40, 3000,"developer");
        System.out.println(firstEmployee.getFullPerson());
        System.out.println(firstEmployee.getJob());
        Employees secondEmployee = new Employees("Andrei","Popa",25,2600,"Tester");
        System.out.println(secondEmployee.getFullPerson() );
        System.out.println(secondEmployee.getJob());
        System.out.println(secondEmployee.getSalary());
        firstEmployee.setSalary(3900);
        System.out.println(firstEmployee.getSalary());
    }
}
