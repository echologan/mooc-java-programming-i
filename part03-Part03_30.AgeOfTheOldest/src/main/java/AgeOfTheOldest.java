
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creating two variable inside main method, outside the while loop
        int age = 0;
        int n = 0;

        // looping through each input read from scanner
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            // splitting apart inputs commas to create an array then storing it
            String[] parts = input.split(",");
            // converting second element of array or first index into integer
            // storying the value of second element inside age variable
            age = Integer.valueOf(parts[1]);

            // if age is greater than n, n = age
            if (age > n) {
                n = age;
            }

        } // closing while loop

        // n is now the greatest variable in the array
        System.out.println("Age of the oldest: " + n);

    } // closing main
} // closing class
