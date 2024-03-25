
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //array of int type called numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            //variable called luka storing int input from scanner
            int luku = Integer.valueOf(scanner.nextLine());
            //breaking out of while loop if input equals -1
            if (luku == -1) {
                //displaying the array before breaking out of loop
                System.out.println(numbers);
                break;
            }
            //adding 'luka' input to 'numbers' list
            numbers.add(luku);
        }

    }
}
