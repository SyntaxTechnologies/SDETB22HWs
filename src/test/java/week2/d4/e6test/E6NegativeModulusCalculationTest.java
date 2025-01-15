package week2.d4.e6test;

import org.example.week2.d4.e6.E6NegativeModulusCalculation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E6NegativeModulusCalculationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testNegativeModulusCalculation() {
        E6NegativeModulusCalculation.main(new String[]{});
        String expectedOutput = "-21 mod 4 = -1" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variables 'dividend' and 'divisor' and performs the modulus operation correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
