package teachBitLab;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cat este ora? ");
        int hour = scan.nextInt();
        if( hour <= 11 ){
            System.out.println("Buna Dimineata");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Buna ziua");
        }else{
            System.out.println("Buna seara");
        }

    }
}
