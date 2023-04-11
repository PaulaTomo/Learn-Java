package teachBitLab;

import java.util.Arrays;
import java.util.Comparator;

public class ForLoop {
    public static void main(String[] args) {
        String[] employees = {"Maria" , "Ion" ,"Max", "John" };
        for (int i = 0 ; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
          for (int number = 0; number <=20; number++){
              System.out.println(number);

            }

          Integer[] numbers = {1,5,6,9,8,2,4,3,10};
          Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        //Odd and even numbers from 0 to 1000

        for(int i = 0; i < 1001; i++){
            if (i % 2 == 0){
                System.out.println("The number " + i + " is even");
            }else{
                System.out.println("The number " + i + " is odd");
            }

        }

        }

}
