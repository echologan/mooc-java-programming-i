
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int sum1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sum2 = Integer.valueOf(scanner.nextLine());
        int sum3 = sum1 + sum2;
        System.out.println("The sum of the numbers is " + sum3);
    }
}
