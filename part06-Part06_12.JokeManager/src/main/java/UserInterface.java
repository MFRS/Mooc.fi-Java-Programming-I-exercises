/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private final JokeManager jokeManager;
    private final Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        final Map<String, String> validCommands = new HashMap<>();
        validCommands.put("1", " - add a joke");
        validCommands.put("2", " - draw a joke");
        validCommands.put("3", " - list jokes");
        validCommands.put("X", " - stop");

        while (true) {
            for (Map.Entry<String, String> stringStringEntry : validCommands.entrySet()) {
                System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
            }
            String input = scanner.nextLine();
            if (!validCommands.containsKey(input)) {
                System.out.println("Unknown command");
            }

            if ("1".equalsIgnoreCase(input)) {
                System.out.println("Write the joke to be added:");
                final String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            }
            if ("2".equalsIgnoreCase(input)) {
                System.out.println(jokeManager.drawJoke());
            }

            if ("3".equalsIgnoreCase(input)) {
                System.out.print("Printing the jokes.");
                jokeManager.printJokes();
            }

            if ("X".equalsIgnoreCase(input)) {
                System.out.println("X");
                break;
            }
        }
    }
}