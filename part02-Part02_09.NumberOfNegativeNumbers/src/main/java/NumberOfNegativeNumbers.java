
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negCount = 0;
        while(true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number < 0) {
                negCount = negCount + 1;
            } 
            if(number == 0) {
                break;
            }
        } //close loop
        System.out.println("Number of negative numbers: " + negCount);
    }
}
