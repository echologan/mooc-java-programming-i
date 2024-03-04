
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");    
        int lastNum = Integer.valueOf(scanner.nextLine());
        int c = 0;
        for (int i = 0; i <= lastNum; i++) {
            c += i;
        }
        System.out.println("The sum is " + c);

    }
}
