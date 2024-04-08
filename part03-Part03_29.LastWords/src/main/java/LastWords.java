
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
            String[] inputArray = input.split(" ");
            int getElementAtThisIndex = (inputArray.length - 1);
            System.out.println(inputArray[getElementAtThisIndex]);

        }
    }
}
