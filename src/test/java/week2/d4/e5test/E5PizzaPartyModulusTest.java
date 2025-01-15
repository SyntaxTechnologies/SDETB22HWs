package week2.d4.e5test;

import org.example.week2.d4.e5.E5PizzaPartyModulus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5PizzaPartyModulusTest {

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
    void testPizzaParty() {
        E5PizzaPartyModulus.main(new String[]{});
        String expectedOutput = "Each person gets 3 slices." + System.lineSeparator() +
                "There are 1 slices left over." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variables 'totalSlices' and 'friends' and performs the modulus operation correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
