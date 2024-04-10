
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

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            nameLength = pieces[0].length();

            if (nameLength > longerName) {
                longerName = nameLength;
                name = String.valueOf(pieces[0]);
            }

            birthYear = Integer.valueOf(pieces[1]);
            avgOfB += birthYear;
            loopCount++;

        } // closing while

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * avgOfB / loopCount);
    }
}
