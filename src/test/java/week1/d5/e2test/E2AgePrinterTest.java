package week1.d5.e2test;


import org.example.week1.d5.e2.E2AgePrinter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2AgePrinterTest {

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
    void testAgeOutput() {
        E2AgePrinter.main(new String[]{});
        String expectedOutput = "4" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the value of the 'age' variable as expected.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
