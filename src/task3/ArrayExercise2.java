package task3;

/*
Write a method that returns the nth odd element of an array.
If the index of the element exceeds the list size, then return -1. Example: [5, 3, 8, 1, 9] 4 -> 9 [5, 3, 8, 1, 9] 5 -> -1
*/

import java.util.Scanner;

public class ArrayExercise2 {
    static int nthOddElement(int[] arr, int size, int nth) {
        int oddCounter = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 1) {
                oddCounter++;
            }
            if (oddCounter == nth) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Input array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int nthOdd = 0;
        System.out.print("Input n, to find the n-th odd number of the array: ");
        nthOdd = scanner.nextInt();
        System.out.printf("The %d-th odd number in the array is: %d.%n",
                nthOdd, nthOddElement(arr, size, nthOdd));
    }
}
