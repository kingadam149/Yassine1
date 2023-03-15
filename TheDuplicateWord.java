import java.util.HashMap;
import java.util.Set;

public class TheDuplicateWord {
    // Write a java program to find the duplicate words and their number of occurrences in the string
    // "Java is a programming language. Java is also an Island of Indonesia. Java is a widely used
    // language". Also, Find the average length of the words.

    public static void main(String[] args) {

        String txt="Java is a programming language. Java is also an Island of Indonesia. Java is a widely used language";

        String item[] = txt.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}







