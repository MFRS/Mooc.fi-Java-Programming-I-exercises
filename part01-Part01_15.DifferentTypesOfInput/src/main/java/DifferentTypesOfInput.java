
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
           System.out.println("Give a string:");
            String text = scan.nextLine();
            System.out.println("Give an integer:");
            int int1 = Integer.valueOf(scan.nextLine());
            System.out.println("Give a double:");
            double int2 = Double.valueOf(scan.nextLine());
            System.out.println("Give a boolean:");
         
            boolean bool = Boolean.valueOf(scan.nextLine());

         
            System.out.println("You gave the string " + text);
            System.out.println("You gave the integer " + int1);
            System.out.println("You gave the double " + int2);
            System.out.println("You gave the boolean " + bool);
    }
}
