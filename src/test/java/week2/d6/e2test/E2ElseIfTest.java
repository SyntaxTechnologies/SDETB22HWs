package week2.d6.e2test;

import org.example.week2.d6.e2.E2ElseIf;
import org.example.week2.d6.e5.E5ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2ElseIfTest {

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
    void testOutput() {
        // Calls the main method with no arguments because temperature is hardcoded as 25 inside the code.
        E2ElseIf.main(new String[]{});

        // Expected output since temperature = 25
        String expectedOutput = "It's warm outside." + System.lineSeparator();

        assertEquals(
                expectedOutput,
                outContent.toString(),
                "The output does not match the expected output for temperature=25."
        );
    }
}