
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }

        }

    }
}
