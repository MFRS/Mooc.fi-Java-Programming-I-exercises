
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// read values until user inputs 0
// only count negative input numbers
// 0 used to exit the loop should not be included in total number count
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
