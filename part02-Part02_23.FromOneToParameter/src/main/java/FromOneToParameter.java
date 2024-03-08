

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(4);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {

            System.out.println(i);
        }
        // int i = 0;
        // while (i < number) {
        //     System.out.println(number);
        //     i++;
        // }
    }
}
