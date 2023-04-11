package teachBitLab;

import java.util.Scanner;

public class NumberMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        double numar1 = scanner.nextDouble();
        System.out.print("Introduceti al doilea numar: ");
        double numar2 = scanner.nextDouble();
        System.out.print("Introduceti al treilea numar: ");
        double numar3 = scanner.nextDouble();
        System.out.print("Introduceti al patrulea numar: ");
        double numar4 = scanner.nextDouble();
        System.out.print("Introduceti al cincilea numar: ");
        double numar5 = scanner.nextDouble();

        double media = (numar1 + numar2 + numar3 + numar4 + numar5) / 5;

        System.out.println("Media aritmetica a numerelor introduse este: " + media);
    }
}
