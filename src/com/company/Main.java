package com.company;

public class Main {


    public static void main(String[] args) {

        int n = 16;
        System.out.println("The factorial of " + n + " is: " + factorial(n));
        System.out.println("The fibonacci of " + n + " is: " +fibonacci(n));
    }
    public static int factorial ( int n){
        if(n <= 1){
            return 1;
        }
        else
            // 5 * (5-1) * (4-1) * (3-1) * (2-1)
            return n * factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
