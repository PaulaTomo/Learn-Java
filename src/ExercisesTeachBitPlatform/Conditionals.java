package ExercisesTeachBitPlatform;

import java.util.Locale;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        //1. Scrie un program in care primesti trei variabile si afisezi cel mai mare numar dintre acestea.

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert first number");
        float firstNumber = scan.nextInt();
        System.out.println("Insert second number");
        float secondNumber = scan.nextInt();
        System.out.println("Insert the third number");
        float numberThree = scan.nextInt();

        if (firstNumber > secondNumber && firstNumber > numberThree) {
            System.out.println(firstNumber + " is greater number");
        } else if (secondNumber > firstNumber && secondNumber > numberThree) {
            System.out.println(secondNumber + " is greater number");

        } else {
            System.out.println(numberThree + " is greater number");

        }

        /*2. Creaza un program care accepta numerele reale (float), pozitive si negative.
        Daca numarul e pozitiv, se va afisa “POZ“, daca este negativ, va afisa “NEG”.*/
        System.out.println("Insert a positive or negative number");
        float theNumber = scan.nextFloat();
        if (theNumber > 0) {
            System.out.println(theNumber + " is a positive number");
        } else {
            System.out.println(theNumber + " is a negative number");

        }
        /*
        3. Scrie un program care numara cate vocale contine un sir de caractere.
         Daca numarul lor este mai mare decat cel al consoanelor, afiseaza “TRUE”,
          altfel afiseaza “FALSE”.
        */
        System.out.println("Insert a string");
        String myStr = scan.nextLine();

        int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < myStr.length(); i++){
            char character = myStr.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowel++;

            }else{
                consonant++;

            }
        }
        if(vowel > consonant){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

       // Scrie un program care citeste de la tastatura trei numere. La final va afisa daca numere sunt in ordine crescatoare, descrescatoare sau indecis.
        System.out.println("Introdu primul numar");
        int a = scan.nextInt();
        System.out.println("Introdu al doilea numar");
        int b = scan.nextInt();
        System.out.println("Introdu al treilea numar");
        int c = scan.nextInt();
        if(a > b && b > c){
            System.out.println("Numerele introduse sunt in ordine descrescatoare");
        }else if(c > b && c > a){
            System.out.println("Numerele introduse sunt in ordine crescatoare");
        }else {
            System.out.println("Numerele introduse sunt in ordine indecisa");

        }


        }

    }
