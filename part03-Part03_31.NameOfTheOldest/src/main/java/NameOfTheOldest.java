
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int n = 0;
        String name = "a";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] array = input.split(",");
            age = Integer.valueOf(array[1]);

            /*
             * age is holding the second element of the array in a int value via
             * calling the 1 index. each time this while loop runs and we get another input
             * from a new line the age is still stored from last loop. thus we need another
             * variable to compare against in this case 'n'. so if I run program and input
             * logan,4 (enter, nextline) jake,6 (enter and enter again to break out) age
             * first
             * holds value 4, compares 4 to 'n' which starts out at 0 so now age and n is
             * both 4.
             * next loop age is then switched to next input which if now 6 so at this point
             * n and age
             * are different values.
             */
            if (age > n) {
                n = age;
                name = String.valueOf(array[0]);
            }

        }
        System.out.println("oldest " + name);
    }
}
