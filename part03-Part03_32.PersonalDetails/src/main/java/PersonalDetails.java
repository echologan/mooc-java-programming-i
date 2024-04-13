
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables outside loop
        int nameLength = 0;
        int longerName = 0;
        String name = "filler";
        int birthYear = 0;
        int avgOfB = 0;
        int loopCount = 0;

        // each time something is entered the loop starts again unless nothing input
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            // string array by splitting string variable
            String[] pieces = input.split(",");
            // find how many letters in array index 0 (name) using length method
            nameLength = pieces[0].length();

            // longerName is place holder for the highest number each time loops
            if (nameLength > longerName) {
                longerName = nameLength;
                // if the name is longer capture that actual value or name in index 0
                name = String.valueOf(pieces[0]);
            }

            // getting the value of index 1 (birth year), converting it to integer
            birthYear = Integer.valueOf(pieces[1]);
            avgOfB += birthYear;
            loopCount++;

        } // closing while

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * avgOfB / loopCount);
    }
}
