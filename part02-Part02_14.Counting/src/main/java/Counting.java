
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int number = scanner.nextInt();
        // Next, the program prints numbers from 0 to the number given by the user. You can assume that the user always gives a positive number.
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
