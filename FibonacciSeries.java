import java.util.ArrayList;

public class FibonacciSeries {

    //Write 40 Fibonacci series with java. The output should be like 0,1,1,2,3,5,8,13, 21, 34, 55, 89


    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();//ArrayList
        int i = 0, j =1;
        System.out.print(i +" " +j + " ");

        int s = 0;
        while(s < 10){
            int temp = i + j;
            arr.add(temp);
            i = j;
            j = temp;
            s++;
        }

        for(Integer v : arr)
            System.out.print(v+" ");
    }
}



