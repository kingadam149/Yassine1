import java.io.*;
public class PalindromeOrNot1 {
    //If a String is reversed and it remains unchanged, that is called Palindrome. For example,
    // MOM, DAD, MADAM are Palindrome. So write java code to check if a given String is Palindrome or not.

        public static boolean isPalindrome(String str) {
            String a = "MOM";
            String b = "DAD";
            String c = "MADAM";


            boolean Palindrome = true;

            for (int i = str.length() - 1; i >= 0; i--) {
                a = a + str.charAt(i);
            }

            if (str.equals(a)) {
                Palindrome = true;
            }
            return Palindrome;
        }
        public static void main(String[] args) {
            String str = "";


            str = str.toUpperCase();
            boolean A = isPalindrome(str);
            System.out.println(A);

            if (isPalindrome(str))
                System.out.print("It is a palindrome");
            else
                System.out.print("It is not a palindrome");
        }
    }





