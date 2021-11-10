package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class Main.Main.FizzBuzzDetector
 * @since 10.11.2021 - 13.24
 **/
public class FizzBuzzDetector {
    String inputLine;

    public FizzBuzzDetector() {
    }

    public FizzBuzzDetector(String inputLine) {
        this.inputLine = inputLine;
    }

    public String getInputLine() {
        return inputLine;
    }

    public void setInputLine(String inputLine) {
        this.inputLine = inputLine;
    }

    public static FizzBuzzOutput getOverlappings(String inputLine) {
        ArrayList<String> words = new ArrayList<>(List.of(inputLine.split(" ")));
        String outputLine = words.get(0);
        words.remove(0);
        int coincidenceCounter = 0;
        int numberOfWordInInitialLine = 2;

        do {
            if (words.get(0).matches(".*[a-zA-Z0-9].*")) {
                if (numberOfWordInInitialLine % 3 == 0 && !(numberOfWordInInitialLine % 5 == 0)) {
                    words.set(0, "Fizz");
                    coincidenceCounter++;
                } else if (!(numberOfWordInInitialLine % 3 == 0) && numberOfWordInInitialLine % 5 == 0) {
                    words.set(0, "Buzz");
                    coincidenceCounter++;
                } else if (numberOfWordInInitialLine % 3 == 0) {
                    words.set(0, "FizzBuzz");
                    coincidenceCounter++;
                }
                numberOfWordInInitialLine++;
            }
            outputLine = outputLine.concat(" " + words.get(0));
            words.remove(0);
        } while (!words.isEmpty());

        return new FizzBuzzOutput(outputLine, coincidenceCounter);
    }
}

