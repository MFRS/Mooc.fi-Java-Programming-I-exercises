
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = scan.nextInt();
        // if the year is divisible by 100, its only a leap year when also divisible by 400
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }
        } else {
            // if the year is not divisible by 100, its a leap year when divisible by 4
            if (year % 4 == 0) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }
        }
    }
}
