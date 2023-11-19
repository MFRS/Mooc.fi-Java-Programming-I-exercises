
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// print square
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The square of " + number + " is " + number * number);
    }
}
