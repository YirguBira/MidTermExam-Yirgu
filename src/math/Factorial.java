package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    //Factorial with recursion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please key in an integer");
        int num1 = scanner.nextInt();

        Factorial factorial = new Factorial();
        int num2 = factorial.Factor(num1);
        System.out.println("Factorial of "+num1+" is "+num2);
    }

    int Factor(int n){
        if(n>1){
            return (n*Factor(n-1));
        }
        return n;
    }
}
