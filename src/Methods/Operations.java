package Methods;

import java.util.Scanner;

public class Operations {

    private static int getSum(int numOne, int numTwo){
        return numOne + numTwo;
    }
    private static int multiply(int numOne, int numTwo){
        return numOne * numTwo;
    }
    public static void main (String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one");
        int numOne = scanner.nextInt();
        System.out.println("Enter number two");
        int numTwo = scanner.nextInt();
        System.out.println("You entered numOne " + numOne + " and numTwo "+ numTwo);

        System.out.println("Please type in : \n 1 - to getSum; \n 2 - multiply");
        int operationNumber = scanner.nextInt();

        int result = 0;
        if(operationNumber == 1){
            System.out.println("You've chosen 1 - getSum");
            result = Operations.getSum(numOne,numTwo);
        }else if(operationNumber == 2){
            System.out.println("You've chosen 2 - multiply ");
            result = Operations.multiply(numOne,numTwo);
        }
        System.out.println("The result is " + numOne + (operationNumber == 1 ? " + " : " * ") + numTwo + " = " + result);
    }
}
