package Test;

import Main.FizzBuzzDetector;
import Main.FizzBuzzOutput;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class FizzBuzzDetectorTest
 * @since 10.11.2021 - 16.14
 **/

class FizzBuzzDetectorTest {
    String line;
    String lineWithoutWords;
    String lineAlphanumeric;


    @BeforeEach
    void setUp() {
        line = "Mary had a little lamb Little lamb, little lamb Mary had a little lamb It's fleece was white as snow";
        lineWithoutWords = "////// ??????";
        lineAlphanumeric = "Mary had a little l5mb Little lamb, little lamb Mary had a little 777 It's fleece was white as sno6";
    }

    @org.junit.jupiter.api.Test
    public void testResult() {
        assertEquals(9, FizzBuzzDetector.getOverlappings(line).getCoincidenceCounter());
    }

    @org.junit.jupiter.api.Test
    public void testResultNoWords() {
        assertEquals(0, FizzBuzzDetector.getOverlappings(lineWithoutWords).getCoincidenceCounter());
    }

    @org.junit.jupiter.api.Test
    public void testResultAlphanumericWords() {
        assertEquals(9, FizzBuzzDetector.getOverlappings(line).getCoincidenceCounter());
    }
}
