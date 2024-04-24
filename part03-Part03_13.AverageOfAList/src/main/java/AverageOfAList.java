
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        
        double sum = 0;
        double i = 0;
        

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            list.add(input);

        } // closing while loop 

        System.out.println("");

        // for-each loop if you dont need to keep track of index
        // has no separate condition for repeating or incrementing thus added in i
        // i used it here so i could give each element in list a variable name easily
        for (int listValue: list) {
            sum += listValue;
            i++; 
        }

        System.out.println("Average: " + (sum/i));

    } // closing main
} // closing class
