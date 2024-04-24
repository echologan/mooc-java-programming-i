
import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayWords;

        while (true) {
            // if input is blank break out of loop
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            // taking input from scanner and splitting spaces from input
            arrayWords = input.split(" ");

            for (String word : arrayWords) {
                System.out.println(word);
            }
        } // closing while

    } // closing main

} // closing class
