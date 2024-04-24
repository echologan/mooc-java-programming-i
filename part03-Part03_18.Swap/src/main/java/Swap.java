
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Give two indices to swap: ");
        int position1 = Integer.valueOf(scanner.nextLine());
        int position2 = Integer.valueOf(scanner.nextLine());
        // Now input captured we use them as indexes to swap the values in array
        int helper = array[position1]; // assigning first input to variable
        array[position1] = array[position2]; // assigning second input to first position
        array[position2] = helper; // assigning variable with first input to second position

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
