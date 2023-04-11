package methods.Exercises;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a string");
        String inputStr = scan.nextLine();
        String name = myMethodReturn(inputStr);
    }


    public static String myMethodReturn(String str){
        int myStr = str.length();
        if(myStr % 2 == 0){
            int lungime = myStr / 2;
            System.out.println("Jumatatea lungimii cuvantului este : " + lungime);
        }else if(myStr % 2 != 0) {
            float lungime = myStr / 2;
            System.out.println("Jumatatea lungimii cuvantului este : " + lungime);
        }
        return ("Nu pot da un raspuns");

    }

}
