package task2;

/*Write a method that returns the index of the first occurrence of given integer in an array. The index of the first element in the list is zero.
If the number does not exist return -1.
Example: [5, 3, 8, 1, 3] 3 -> 1
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    static int indexAtFirstOccurrence(int[] arr, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        size = scanner.nextInt();

        int []arr = new int[size];
        System.out.print("Input array elements: ");
        for(int i =0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        int numberToCheck = 0;
        System.out.print("Input a number, and find it's fist occurrence: ");
        numberToCheck = scanner.nextInt();

        System.out.printf("The index of the first occurrence of %d in the array is: %d.%n",
                numberToCheck, indexAtFirstOccurrence(arr,size, numberToCheck));
    }
}
