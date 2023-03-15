public class FactorialOf5 {

    // 1.	Write a java program to find the Factorial of a given number using Recursion as well as
    // Iteration. Note: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.


        // Method to find factorial of the given number
        static int factorial(int n) {
            int res = 1, i;
            for (i = 2; i <= n; i++)
                res *= i;
            return res;
        }

        // Driver method
        public static void main(String[] args)
        {
            int num = 5;
            System.out.println(
                    "Factorial of " + num + " is " + factorial(5));
        }
    }





