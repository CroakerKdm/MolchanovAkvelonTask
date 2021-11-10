package Test;

import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Croaker
 * @version 1.0.0
 * @project MolchanovAkvelonTask
 * @class FizzBuzzDetectorTest
 * @since 10.11.2021 - 15.55
 **/

class InputTest {
    String line;

    @BeforeEach
    void setUp() {
        line = "Mary had a little lamb Little lamb, little lamb Mary had a little lamb It's fleece was white as snow";
    }

    @org.junit.jupiter.api.Test
    void testInputExist() {
        assertNotNull(line);
    }

    @org.junit.jupiter.api.Test
    void testInputNotOutOfBounds() {
        assertThat(line, (line.length() >= 7 && line.length() <= 100));
    }
}