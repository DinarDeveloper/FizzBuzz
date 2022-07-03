import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    private static final Marker SEARCH_FILE = MarkerManager.getMarker("SEARCH_FILE");
    private static final Marker SEARCH_ERRORS = MarkerManager.getMarker("SEARCH_ERRORS");

    private static final String INFO = "- enter a number from 1 to 100\n" +
            "- to exit the game, press 0\n" +
            "- for information, enter the command info";

    public static void main(String[] args) {

        System.out.println("Welcome to Fizz Buzz!\nSubmit a number and get an answer!");
        System.out.println("info - information\n0 - exit");

        while (true) {
            scanNumber();
        }
    }

    static boolean checkNumber(int inputNumber) {
        return inputNumber >= 1 & inputNumber <= 100;
    }

    static String fizzBuzz(String inputNumber) {
        int number = Integer.parseInt(inputNumber);
        if (checkNumber(number)) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else {
                LOGGER.info(SEARCH_FILE, "Number " + number);
                return "Number: " + number;
            }
        } else {
            LOGGER.error(SEARCH_ERRORS, "Input Error " + inputNumber);
            return "Error. Enter a number from 1 to 100!!!";
        }
    }

    private static void scanNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.next();
        switch (inputNumber) {
            case "info":
                LOGGER.info(SEARCH_FILE, "Information sent");
                System.out.println(INFO);
                break;
            case "0":
                LOGGER.info(SEARCH_FILE, "To exit the game, press " + inputNumber);
                System.exit(0);
                break;
            default:
                if (inputNumber.matches("\\d{1,3}")) {
                    System.out.println(fizzBuzz(inputNumber));
                } else {
                    LOGGER.error(SEARCH_ERRORS, "Input Error " + inputNumber);
                    System.out.println("Input Error");
                }
                break;
        }
    }
}