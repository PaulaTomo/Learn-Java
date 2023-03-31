package NewExercises;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number");
        int inputNumber = scan.nextInt();
        int myNumber = getSumMethod(inputNumber);


//        Scanner scan = new Scanner(System.in);
//        int monday = 1, tuesday = 2, wednesday = 3, thursday = 4, friday = 5, saturday = 6, sunday = 7;
//
//        System.out.println("Insert a number from 1 to 7");
//        int monthDay = scan.nextInt();
//        switch (monthDay) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//        }
//
//        int count = 0, suma = 0;
//        while (true) {
//            if (count == 5) {
//                System.out.print("ABC");
//                suma += count;
//                break;
//            }
//            count++;
//        }
//        System.out.println(suma);
    }


    public static int getSumMethod(int number) {
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }
    public static int getSumMethodTwo(int number){
        String numberString = String.valueOf(number);
int sum = 0;
        return sum;
    }

}
