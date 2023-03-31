package NewExercises;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Introduceti 3 numere de la tastatura si afisati-l pe cel mai mare;
        System.out.println("Insert first number");
        int numberOne = scan.nextInt();
        System.out.println("Insert second number");
        int numberTwo = scan.nextInt();
        System.out.println("Insert third number");
        int numberThree = scan.nextInt();
        if(numberOne > numberTwo && numberOne > numberThree){
            System.out.println(numberOne + " is the greater number");
        }else if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println(numberTwo + " is the greater number");
        }else{
            System.out.println(numberThree + " is the greater number");
        }
    }
}
