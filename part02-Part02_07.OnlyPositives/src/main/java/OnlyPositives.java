
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int numInput = Integer.valueOf(scanner.nextLine());
            
            if (numInput < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (numInput > 0) {
                numInput = numInput * numInput;
                System.out.println(numInput);
            }

            if (numInput == 0) {
                break;
            }
        }

    }
}
