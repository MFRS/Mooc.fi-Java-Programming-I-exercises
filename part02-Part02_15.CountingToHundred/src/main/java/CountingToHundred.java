
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // reads int from user
        // print from that number to 100
        // user always gives number less than 100
        int number = scanner.nextInt();
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
        
    }
}
