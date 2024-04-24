
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int fNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int sNum = Integer.valueOf(scanner.nextLine());
        int c = 0;
        for (int i = fNum; i <= sNum; i++) {
            c += i;
        }
        System.out.println("The sum is " + c);
    }
}
