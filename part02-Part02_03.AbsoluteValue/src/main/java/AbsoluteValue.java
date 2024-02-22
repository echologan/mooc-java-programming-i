
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usrInt = Integer.valueOf(scanner.nextLine());

        if (usrInt < 0 ) {
            System.out.println(usrInt * -1);
        } else {
            System.out.println(usrInt);
            System.out.println("f");
        }

    }
}
