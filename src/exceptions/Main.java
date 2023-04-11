package exceptions;

public class Main {
    public static void main(String[] args) {
        checkAge(15);

        /////////////////////////////////
        try {
            int v[] = {1, 2, 3};
            v[4] = 5;
            System.out.println(v[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error index");
        }


        ////////////////////////////////

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[4]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("the 'try catch' is finished");
        }
    }

        ////////////////////////////////////
    static void checkAge(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Access denied - you must be at least 18 years old");
            } else {
                System.out.println("Access granted - you are old enough");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error age");
            ;
        }
    }


}
