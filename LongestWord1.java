public class LongestWord1 {
    //Write a java program to Find the length and longest word in the given sentence below.   "Human brain
    // is a biological learning machine". Note: Should return "10 biological".

    public static void main(String[] args) {

            String sentence = "Human brain is a biological learning machine";
            String[] words = sentence.split(" ");
            int maxLength = 0;
            String longestWord = "";
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longestWord = word;
                }
            }
            System.out.println("Length: " + maxLength);
            System.out.println("Longest word: " + longestWord);
        }

    }
