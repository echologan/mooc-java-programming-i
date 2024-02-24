
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; 

        while(true) {
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            
            if (num == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                sum += num;
            } //end of if
        } //end of while loop
    }
}
