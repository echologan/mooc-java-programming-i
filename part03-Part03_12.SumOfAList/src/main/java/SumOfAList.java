
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        // declaring sum variable outside of loops so it can be used later
        int sum = 0; 

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } // closing if

            list.add(input);
        } // closing while 

        System.out.println("");

        // use for-each loop to find the sum
        // this will loop through each value/index in list
        //each loop will add this value to sum variable
        for (Integer listValue: list) {
            sum += listValue;
        }

        System.out.println("Sum: " + sum);
    } //closing main 
} // closing class
