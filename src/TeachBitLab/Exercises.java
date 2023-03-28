package TeachBitLab;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        /* EX 1.
        CREAZA UN PROGRAM CARE SA RECUNOASCA NUMERELE POZITIVE SAU NEGATIVE ATUNCI CAND USERUL INSEREAZA UN NUMAR
        */
        System.out.println("please insert a number");
        int positiveOrNegativeNumber = scan.nextInt();

        if (positiveOrNegativeNumber > 0){
            System.out.println(positiveOrNegativeNumber + " is a positive number");
        }else if(positiveOrNegativeNumber == 0 ){
            System.out.println(positiveOrNegativeNumber + " is a neutral number");
        }else{
            System.out.println(positiveOrNegativeNumber + " is a negative number");

        }

        /* ex2
        Creaza un program in care sa ceri userului sa scrie 3 numere si apoi sa se afiseze cel mai mare numar.
        */
        System.out.println("insert first number");
        int firstNumber = scan.nextInt();
        System.out.println("insert second number");
        int secondNumber = scan.nextInt();
        System.out.println("insert the third number");
        int thirdNumber = scan.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber ){
            System.out.println(firstNumber + " is a greater number");
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber + " is a greater number");
        }else{
            System.out.println(thirdNumber + " is a greater number");
        }



        }
    }

