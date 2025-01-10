package week1.d5.e4test;


import org.example.week1.d5.e4.E4CreatingVariablesAndPrinting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4CreatingVariablesAndPrintingTest {

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
    void testPatternOutput() {
        E4CreatingVariablesAndPrinting.main(new String[]{});
        String expectedOutput = "*" + System.lineSeparator() +
                                "**" + System.lineSeparator() +
                                "***" + System.lineSeparator() +
                                "##" + System.lineSeparator() +
                                "#" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected pattern.\n" +
                "Please ensure that your program prints the exact pattern as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
