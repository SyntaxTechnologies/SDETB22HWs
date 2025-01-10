package week1.d5.e1test;


import org.example.week1.d5.e1.E1BooleanPrinter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1BooleanPrinterTest {

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
    void testBooleanOutput() {
        E1BooleanPrinter.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator() + "false" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints exactly two lines:\n" +
                "'true' followed by 'false'. Check your print statements and\n" +
                "ensure that the boolean variables are correctly assigned.\n";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
