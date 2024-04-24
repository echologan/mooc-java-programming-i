
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the Gift?");
        double gV = Double.valueOf(scan.nextLine());
        //going to use this variable in if statement to make it easier
        double band1 = (100 + (gV - 5000) * 0.08);
        double band2 = (1700 + (gV - 25000) * 0.10);
        double band3 = (4700 + (gV - 55000) * 0.12);
        double band4 = (22100 + (gV - 200000) * 0.15);
        double band5 = (142100 + (gV - 1000000) * 0.17);

        if (gV < 5000) {
            System.out.println("No tax!");
        } else if (gV >= 5000 && gV < 25000) {
            System.out.println("Tax: " + band1);
        } else if (gV >= 25000 && gV < 55000) {
            System.out.println("Tax: " + band2);
        } else if (gV >= 55000 && gV < 200000) {
            System.out.println("Tax: " + band3);
        } else if (gV >=200000 && gV < 1000000) {
            System.out.println("Tax: " + band4);
        } else if (gV >= 1000000) {
            System.out.println("Tax: " + band5);
        }



        // if (gV < 5000) {
        //     System.out.println("No tax!");
        // } else if (gV > 5000 || gV < 25000) {
        //     System.out.println("Tax: " + (100 + (gV - 5000) * .08));
        // } else if (gV > 25000 || gV < 55000) {
        //     System.out.println("Tax: " + (1700 + (gV - 25000) * .1));
        // } else if (gV > 55000 || gV < 200000) {
        //     System.out.println("Tax: " + (4700 + (gV - 55000) * .12));
        // } else if (gV > 200000 || gV < 1000000) {
        //     System.out.println("Tax: " + (22100 + (gV - 200000) * .15));
        // } else {
        //     System.out.println("Tax: " + (142100 + (gV - 1000000) * .17));
        // }

    }
}
