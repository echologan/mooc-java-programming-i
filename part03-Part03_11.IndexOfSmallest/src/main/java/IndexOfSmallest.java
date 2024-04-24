
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            } // closing if

            list.add(input);

        } // closing while 
        
        // variable outside the loop so it can be used inside
        int smallest = list.get(0);
        int num = 0;
        
        // looping thru list, using if to get the smallest number in list
        for (int i = 0; i < list.size(); i++) {
            num = list.get(i);
            if (smallest > num) {
                smallest = num;
            }
        }
        
        // printing out the smallest number in list
        System.out.println("Smallest number: " + smallest);
        
        //looping thru list to find the index position of the smallest number in list
        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            } // closing if

        } // closing for

    } // closing main method

} // closing class
