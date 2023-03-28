package TeachBitLab;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert first number");
        int y = scan.nextInt();
        System.out.println("Insert second number");
        int x = scan.nextInt();
        System.out.println("Diferenta dintre cele doua numere este: " + (y - x));
        System.out.println("Suma este: " + (y + x));
        System.out.println("Rezultatul impartirii este : " + (y / x));
        System.out.println("Restul impartirii este : " + (y % x));
    }
}
