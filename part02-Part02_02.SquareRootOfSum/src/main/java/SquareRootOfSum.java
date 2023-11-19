
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// print square root of the sum of two integers. DOes not neet to work with negative values
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        double squareRoot = Math.sqrt(sum);
        System.out.println("The square root of the sum of " + firstNumber + " and " + secondNumber + " is " + squareRoot);
    }
}
