package task6;

import java.util.Scanner;

/*Implement the Caesar cypher -> https://en.wikipedia.org/wiki/Caesar_cipher*/

public class CaesarCypher {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the text: ");
        String text = scanner.nextLine();
        System.out.print(" Enter the value by which each character in the text gets shifted:");
        int shift = scanner.nextInt();
        String cipherText = "";
        char letter;

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + shift);

                if (letter > 'Z') {
                    letter = (char) (letter + 'A' - 'Z' - 1);
                }
                cipherText = cipherText + letter;
            } else {
                cipherText = cipherText + letter;
            }
        }
        System.out.printf("CipherText: %s%n", cipherText);
    }
}
