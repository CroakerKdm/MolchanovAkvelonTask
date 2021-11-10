package Main;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class Main.Main.FizzBuzzException
 * @since 10.11.2021 - 13.47
 **/
public class FizzBuzzException extends Throwable {
    private String message;

    public FizzBuzzException(String message) {
        this.message = message;
    }

    public String getMessage () {
        return message;
    }
}
