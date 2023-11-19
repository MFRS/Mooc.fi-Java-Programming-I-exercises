
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask for input until user enters 0
        //  After this, the program prints the average of the positive numbers (numbers that are greater than zero).
        // If no positive number is inputted, the program prints "Cannot calculate the average"
        int sum = 0;
        int count = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }
        
    }
}
