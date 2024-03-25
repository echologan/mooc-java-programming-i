
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        } //closing while loop

        //asking user to input, this will be used to search the index of arraylist
        System.out.print("From where? ");
        //storing input from user in start variable 
        int start = scanner.nextInt();
        
        System.out.print("To where? ");
        int end = scanner.nextInt();

        //creating a for loop starting at input 'start' going until start = end 
        //start and end variables are referring to array index
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
        
    }//closing main
}//closing class
