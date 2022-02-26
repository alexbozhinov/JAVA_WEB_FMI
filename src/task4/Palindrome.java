package task4;

/*
A palindrome is a word which reads the same backward or forward.
'abcba' is a palindrome. Write a method that detects if a string is a palindrome.
Tip: Use word.charAt(i) to get the character at position i.
*/

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String word){
        String reversed = "";
        for(int i=word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }

        if(reversed.equals(word)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input word to check if it is a palindrome: ");
        word = scanner.nextLine();

        if(isPalindrome(word) == true){
            System.out.printf("The word: %s, is a palindrome!%n", word);
        }else{
            System.out.printf("The word: %s, is not a palindrome!%n", word);
        }
    }
}
