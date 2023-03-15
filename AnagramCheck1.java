import java.util.Arrays;

public class AnagramCheck1 {

    //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when
    // there is same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        public static boolean isAnagram(String str1, String str2) {

            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();
            char[] charFromstr1 = str1.toCharArray();
            char[] charFromstr2 = str2.toCharArray();
            Arrays.sort(charFromstr1);
            Arrays.sort(charFromstr2);

            return Arrays.equals(charFromstr1, charFromstr2);
        }

        public static void main(String[] args) {
            String str1 = "CAT";
            String str2 = "ACT";

            if (isAnagram(str1, str2)) {
                System.out.println("'" + str1 + "' and '" + str2 + "' is anagram");
            } else {
                System.out.println("'" + str1 + "' and '" + str2 + "' is not anagram");

            }

            String str3 = "ARMY";
            String str4 = "MARY";

            if (isAnagram(str3, str4)) {
                System.out.println("'" + str3 + "' and '" + str4 + "' is anagram");
            } else {
                System.out.println("'" + str3 + "' and '" + str4 + "' is not anagram");

            }

        }
    }

