
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            // if scanner input is blank break while loop
            if (userInput.equals("")) {
                break;
            }

            // string array capturing scanner input
            // 'splitting' out spaced from the scanner input
            String[] arrayWords = userInput.split(" ");

            // for-each loop
            // each element in String array will be called word
            for (String word : arrayWords) {
                // if element in array contains 'av' print the element
                if (word.contains("av")) {
                    System.out.println(word);
                } // closing if
            } // closing for
        } // closing while
    } // closing main
} // closing class
