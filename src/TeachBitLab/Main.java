package TeachBitLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] courses = {"Java" , "Python" , "Sql", "JS"};
        System.out.println(Arrays.toString(courses));

        for(int i = 0 ; i < courses.length; i++){
            System.out.println(courses[i]);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any integer age! 😊 ");
        int input = scan.nextInt();
        if(input >= 18){
            System.out.println("You are an adult!");
        }else if(input <=0 ){
            System.out.println("Invalid age!");
        } else{
            System.out.println("You are under 18 years old!");
        }
    }
}