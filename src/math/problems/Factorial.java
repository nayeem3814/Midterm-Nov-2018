package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    public static void main(String[] args) {
        /* Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration. */

        System.out.println("Factorial of 5 by using Recurtion: "+factorialRecursive(5));
        System.out.println("Factorial of 5 by using Iteration: "+factorialIterative(5));
    }
    //using recurtion
    public static int factorialRecursive(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*factorialRecursive(n-1);
        }
    }
    //now using iteration
    public static int factorialIterative(int n){
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }

        return result;

    }
}