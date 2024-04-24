
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine(); // if use .next instead of nextLine break wont work

            if (firstName.isEmpty()) {
                break;
            } // end of if

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String idNum = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNum));

        } // closing while

        System.out.println();

        for (PersonalInformation pi : infoCollection) {
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    } // closing main
} // closing class
