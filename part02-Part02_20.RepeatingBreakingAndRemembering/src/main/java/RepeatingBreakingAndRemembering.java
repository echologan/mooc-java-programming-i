
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int input = 0;
        int sum = 0;
        int numOfInputs = 0;
        int even = 0, odd = 0;
        double avg = 0;

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (input % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            sum += input;
            numOfInputs ++; 
        }

        avg = 1.0 * sum / numOfInputs;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfInputs);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
