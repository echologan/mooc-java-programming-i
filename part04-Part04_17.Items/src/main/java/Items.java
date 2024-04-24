
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        // Creating arraylist with object, 'item'
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // looping sout name, scanner, if empty break,
        // and adding scanner input to items lists of type Item, input variable is name
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } // closing if

            items.add(new Item(name));

        } // closing while

        // for each loop print item each loop
        for (Item item : items) {
            System.out.println(item);
        }

    } // closing main
}
// testing