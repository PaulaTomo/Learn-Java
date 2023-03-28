package ExercisesTeachBitPlatform;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //4. Scrie un program care afiseaza suma cifrelor unui numar.
        System.out.println("Insert a number greater to 10");
        int number = scan.nextInt();
        int sum =0;
        int a;
        while (number > 0){
            a = number % 10;
            number /= 10;
            sum += a;
        }
        System.out.println("Sum is :" +sum);
    }
}
