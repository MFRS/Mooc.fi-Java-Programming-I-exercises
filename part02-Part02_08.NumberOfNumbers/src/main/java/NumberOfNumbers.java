
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read user values asking "Give a number:" until user gives 0.
        // finally print the number of values given
        // the number 0 should not need to be included in the number of values
        // "Number of numbers" at the end of the program should be printed in the following format:
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            count++;
        }
        System.out.println("Number of numbers: " + count);

    }
}
