package Laborator4;

import java.util.Arrays;

public class DivisorsAndMultiples {
    public static void main(String[] args) {
        divisorNumber(12);
        multiplesNum(12 , 240);
    }
    public static int[] addToArrayAndReturn(int[] arr, int number){
        int [] newArray = {number};
        int [] finalArr = new int[arr.length + newArray.length];
        System.arraycopy(arr,0,finalArr,0,arr.length);
        System.arraycopy(newArray,0,finalArr,arr.length , newArray.length);

        return finalArr;
    }
    public static void divisorNumber(int number){
    int [] divisors = {};
    for (int i = 1 ; i <= number; i++){
        if( number % i == 0){
            divisors = addToArrayAndReturn(divisors, i);
        }

    }
        System.out.printf("Divizorii lui %d sunt:%n", number);
        System.out.println(Arrays.toString(divisors));
    }
    public static void multiplesNum(int number, int limit){
        int [] multiples = {};

        for(int i = 0 ; i <= limit; i++){
            if(i % number == 0){
                multiples = addToArrayAndReturn(multiples, i);
            }
        }
        System.out.printf("Multiplii lui %d sunt:%n", number);
        System.out.println(Arrays.toString(multiples));

    }


}
