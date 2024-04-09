
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

            if (age > n) {
                n = age;
                name = String.valueOf(array[0]);
            }

        }
        System.out.println("oldest " + name);
    }
}
