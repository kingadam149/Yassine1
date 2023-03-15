import java.util.ArrayList;

public class PatternImplement {

    //Read these numbers, find the pattern then implement the logic from this pattern. which will give
    // you this output. 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,
    // 52,49,46,43,40,36,32............

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int x = 100;
        int z = 1;
        int y = 0;
        while (x >= 0) {
            result.add(x);
            x -= z;
            y++;
            if (y == 10) {
                z++;
                y = 0;
            }
        }
        System.out.println(result);
    }
}


