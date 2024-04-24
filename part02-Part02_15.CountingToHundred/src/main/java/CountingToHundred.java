
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());

        for (int c = input; c <= 100; c++) {
            System.out.println(c);
        }

    }
}
