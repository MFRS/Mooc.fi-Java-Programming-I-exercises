
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read numbers until the user enters 0
        // asks "Give a number:", then reads the number given by the user
        // if the number is 0, the program prints the sum of the numbers given and quits
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
