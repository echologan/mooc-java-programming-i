
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        int sumCount =0;
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Number of numbers: " + numCount);
                System.out.println("Sum of the numbers: " + sumCount);
                break;
            } else if (input != 0) {
                numCount ++;
                sumCount += input;
            }
        }
    }
}
