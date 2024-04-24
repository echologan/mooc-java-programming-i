
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        } //closing while loop
        
        System.out.println("");
        // implement finding the greatest number in the list here
        //storing the list element in index 0
        int greatest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (greatest < number) {
                greatest = number;
            } //closing if 
        } //closing for loop
        
        System.out.println("The greatest number: " + greatest);
        
    }//closing main method

}
