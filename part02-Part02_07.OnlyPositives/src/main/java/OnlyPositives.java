
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks the user for numbers. If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            if (number < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(number * number);
            }
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
    }
}
