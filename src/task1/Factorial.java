package task1;

/*
Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
*/

import java.util.Scanner;

public class Factorial {

    int calculateFactorial(int n) {
        if (n >= 1) {
            return n * calculateFactorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 0;
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        number = scanner.nextInt();

        System.out.printf("%d! = %d%n", number, factorial.calculateFactorial(number));
    }

}
