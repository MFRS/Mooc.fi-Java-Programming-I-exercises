
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask user "Give a number:" and assign the user input 0
        // print amount of numbers given as "Number of numbers: " and the amount of numbers given
        // print sum of numbers given as "Sum of the numbers: " and the sum of numbers given
        // number 0 does not needed to be counted in the sum
        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            amountOfNumbers = amountOfNumbers + 1;
            sumOfNumbers = sumOfNumbers + number;
        }
        System.out.println("Number of numbers: " + amountOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
b