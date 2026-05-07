// Java program to find factorial of a number using recursion

import java.util.Scanner;

public class fact {

    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = factorial(num);

        System.out.println("Factorial of " + num + " is: " + ans);

        sc.close();
    }
}
