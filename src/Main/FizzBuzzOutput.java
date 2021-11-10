package Main;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class Main.Main.FizzBuzzOutput
 * @since 10.11.2021 - 13.54
 **/
public class FizzBuzzOutput {
    String outputLine;
    int coincidenceCounter;

    public FizzBuzzOutput() {
    }

    public FizzBuzzOutput(String outputLine, int coincidenceCounter) {
        this.outputLine = outputLine;
        this.coincidenceCounter = coincidenceCounter;
    }

    public String getOutputLine() {
        return outputLine;
    }

    public void setOutputLine(String outputLine) {
        this.outputLine = outputLine;
    }

    public int getCoincidenceCounter() {
        return coincidenceCounter;
    }

    public void setCoincidenceCounter(int coincidenceCounter) {
        this.coincidenceCounter = coincidenceCounter;
    }

    @Override
    public String toString() {
        return "Result '" + outputLine + '\'' +
                ", count: " + coincidenceCounter;
    }
}
