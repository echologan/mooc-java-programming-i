
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int n1 = Integer.valueOf(scan.nextLine());
        
        if (n1 < 0) {
            System.out.println("Grade: impossible!");
        } else if (n1 <= 49) {
            System.out.println("Grade: failed");
        } else if ( n1 <= 59) {
            System.out.println("Grade: 1");
        } else if (n1 <= 69) {
            System.out.println("Grade: 2");
        } else if (n1 <= 79) {
            System.out.println("Grade: 3");
        } else if (n1 <= 89) {
            System.out.println("Grade: 4");
        } else if (n1 <= 100) {
            System.out.println("Grade: 5");
        } else if (n1 > 100) {
            System.out.println("Grade: Incredible!");
        }

    }
}
