
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // looping through scanner input if its blank break out
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            // creating array from variable input which contains scanner input
            // using split method to take out spaces then printing first element of array
            String[] inputIntoArray = input.split(" ");
            System.out.println(inputIntoArray[0]);

        } // closing while
    } // closing main
} // closing class
