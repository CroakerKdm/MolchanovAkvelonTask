package Main;

import java.util.Scanner;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class Main.Main
 * @since 10.11.2021 - 13.24
 **/
public class Main {
    public static void main(String[] args) throws FizzBuzzException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.length() < 6 || line.length() > 100) {
            throw new FizzBuzzException("Wrong size of input string");
        }
        else if (line.isBlank()){
            throw new FizzBuzzException("Input string is empty");
        }

        FizzBuzzOutput result = FizzBuzzDetector.getOverlappings(line);
        System.out.println(result);
    }
}
