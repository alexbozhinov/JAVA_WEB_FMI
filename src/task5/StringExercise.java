package task5;

/*Save in characters/string related data the following pattern:

*
* *
* * *
* * * *
Where the rows are defined by the user input number.*/

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String figure = "";
        int rows = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                figure = figure + "*"; //String is immutable so each time we concatenate next symbol, the program makes a new String object
            }                          //at the end we print the last made new string object

            figure = figure + "%n";
        }
        System.out.printf(figure);

        StringBuilder builder = new StringBuilder();
        int numberOfRows = 0;

        System.out.print("Input number of rows: ");
        numberOfRows = scanner.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                builder.append('*'); //StringBuilder is mutable so each time we append a symbol we make it in the same object
                                     //at the end we print the same object which has changed.
            }
            builder.append('\n');
        }
        System.out.println(builder);
    }
}
