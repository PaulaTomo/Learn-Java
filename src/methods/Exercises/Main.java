package methods.Exercises;

import org.jetbrains.annotations.NotNull;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//
//    public static String returnLength() {
//
//            System.out.println("Input a string");
//            String name = scan.nextLine();
//            int str = name.length();
//            System.out.println("Lungimea cuvantului este: " + str);
//            if (str % 2 == 0) {
//                int lungime = str / 2;
//                System.out.println("Jumatatea lungimii cuvantului este : " + lungime);
//
//            } else if (str % 2 != 0) {
//                float lungime = str / 2;
//                System.out.println("Jumatatea lungimii cuvantului este : " + lungime);
//            }
//        }
//    }
//}

//        //////ex 2
//        Main m= new Main();
//        String str1 = "aasrf4325afdsjiu2d4ef12s58";
//        System.out.println("Sirul dat: "+str1);
//        System.out.println("Numarul cifrelor: " + m.sumaCifrelor(str1));
//        //////////////////
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input a string");
//        String str = scan.nextLine();
//        System.out.println("Caracterul din mijloc este : " + character(str) + "\n");
//    }
//    //1. Scrie un program care returneaza (printr-o metoda) caracterul din mijlocul unul sir.
//
//    public static String character(String str) {
//        int position;
//        int length;
//        if (str.length() % 2 == 0) {
//            position = str.length() / 2 - 1;
//            length = 2;
//        } else {
//            position = str.length() / 2;
//            length = 1;
//        }
//        return str.substring(position, position + length);
//    }
//
//    //  2. Scrie o metoda care numara cate cifre se afla intr-un sir de caracter.
//
//    public int sumaCifrelor(String myStr)
//    {
//        int l = myStr.length();
//        int count = 0;
//        for (int i = 0; i < l; i++)
//            if (Character.isDigit(myStr.charAt(i)))
//                count++;
//        return count;
//    }

public class Main {
    public static void main(String[] args) {
        String str1 = "Ana";
        String str2 = "Dana";
        System.out.println(getMiddleCharacter(str1));
        System.out.println(getMiddleCharacter(str2));
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }
    }
}








