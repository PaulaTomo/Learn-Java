package TeachBitLab;

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

        }

}
