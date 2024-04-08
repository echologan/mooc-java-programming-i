
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            // storing variable input which is the scanner input into array

            /*
             * we cant store input variable into array using split bc
             * it splits the string into elements based on the spaces
             * whereas not using split on input doesn't work because
             * input is just one string or element, input reads a single line
             * of input from the user
             */
            String[] inputArray = input.split(" ");
            int getElementAtThisIndex = (inputArray.length - 1);
            System.out.println(inputArray[getElementAtThisIndex]);

        }
    }
}
