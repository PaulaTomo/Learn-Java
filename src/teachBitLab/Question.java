package teachBitLab;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu numele tau : ");
        String x = scan.nextLine();
        System.out.println("Salut , " + x + "!");
        System.out.println("Cati ani ai? ");
        String y = scan.nextLine();
        System.out.println(y);
        System.out.println("Multi inainte! ");
        System.out.println("Unde locuiesti " + x + "?");
        String w = scan.next();
        System.out.println("wow,e frumos la " + w + "!");
    }
}
