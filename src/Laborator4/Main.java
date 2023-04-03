package Laborator4;

public class Main {
    public static void main(String[] args) {
       isPalindrome("Ana");
        isPalindrome("Paula");
        isPalindrome("222");

    }
    public static void isPalindrome(String word) {
        word = word.trim().toLowerCase();

        boolean isPalindrome = true;
        int i = 0;
        int j = word.length() - 1;
        while (i <= j) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.printf("Cuvantul %s %s palindrom%n", word, (isPalindrome ? "este" : "nu este"));


    }

}
