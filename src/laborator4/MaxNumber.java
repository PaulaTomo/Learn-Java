package laborator4;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
getMax(55,77,88,99,66,25,222);

    }
    public static void getMax(int... myNumbers){
        int max = myNumbers[0];
        for(int i = 0 ; i < myNumbers.length; i++){
            int currentNumber = myNumbers[i];
            max = Math.max(max,currentNumber);
        }
        System.out.printf("Numarul maxim dintre %s este %s%n", Arrays.toString(myNumbers),max);
    }
}
