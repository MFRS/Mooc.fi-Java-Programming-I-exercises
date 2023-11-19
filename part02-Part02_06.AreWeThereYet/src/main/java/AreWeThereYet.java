
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while (number != 4) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }
    }
}
