package week3.d4.e1test;

import org.example.week3.d4.e1.E1ScannerClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1ScannerClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testValidMonth() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter the month number" + System.lineSeparator() +
                                "January" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for a valid month number.\n" +
                "Please ensure that your program captures the month number correctly and prints the corresponding month name.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidMonth() {
        String simulatedInput = "13\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1ScannerClass.main(new String[]{});
        String expectedOutput = "Please enter the month number" + System.lineSeparator() +
                                "Invalid" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid month number.\n" +
                "Please ensure that your program captures the month number correctly and prints 'Invalid' for out-of-range values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
