public class MissingNumber {

    //Find the missing number from 10, 2, 1, 4, 5, 3, 7, 8, 6.

    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("missing numbers");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.println("" + j);
            }
        }
    }
}











