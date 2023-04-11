package exercisesTeachBitPlatform;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //7. Scrie un program care accepta un String care e denumirea unei luni si afiseaza cate zile are acea luna.
        String ianuarie = "31", februarie = "28", martie = "31", aprilie = "30", mai = "31", iunie = "30", iulie = "31", august = "31",
                septembrie = "30", octombrie = "31", noiembrie = "30", decembrie = "31";
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrie numele unei luni : ");
        String month = scan.nextLine();
        switch (month) {
            case "Ianuarie":
            case "Decembrie":
            case "Octombrie":
            case "August":
            case "Iulie":
            case "Mai":
            case "Martie":
                System.out.println(31);
                break;
            case "Aprilie":
            case "Iunie":
            case "Septembrie":
            case "Noiembrie":
                System.out.println(30);
                break;
            case "Februarie":
                System.out.println(28);
                break;
            default:
                System.out.println("Nu ati introdus o luna a anului");
        }


        //4. Scrie un program care afiseaza suma cifrelor unui numar.
        System.out.println("Insert a number greater to 10");
        int number = scan.nextInt();
        int sum = 0;
        int a;
        while (number > 0) {
            a = number % 10;
            number /= 10;
            sum += a;
        }
        System.out.println("Sum is :" + sum);
        //5 Creaza un program care afiseaza primele 100 de numere pozitive.
        for (int i = 0; i < 101; i++) {
            if (i > 0) {
                System.out.println(i);
            }
        }
        //6 Scrie un program care afiseaza in intervalul 1-10 al treilea numar par.
        int count = 0;
        for (int y = 1; y <= 10; y++) {
            if (y % 2 == 0) {
                count++;
                if (count == 3) {
                    System.out.println("Al treilea numar par este " + y);
                    break;
                }
            }
        }


        //   Scrie un program care afiseaza primele cinci cifre mai mari sau egale cu 3, din numarul 64251382.

        int num = 64251382;
        int counter = 0;
        while (num > 0 && counter < 5) {
            int myNum = num % 10;
            if (myNum >= 3) {
                System.out.println(myNum);
                counter++;
            }
            num /= 10;
        }


    }
}
