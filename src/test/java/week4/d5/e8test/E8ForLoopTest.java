package week4.d5.e8test;

import org.example.week4.d5.e8.E8ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E8ForLoopTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(originalIn);
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testForLoop() {
        String simulatedInput = "7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E8ForLoop.main(new String[]{});
        String expectedOutput = "In: 6 5 4 3 2 1 0 " ;

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers in reverse based on user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);

        // Reset the output stream for the next test
        outContent.reset();

        simulatedInput = "12\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E8ForLoop.main(new String[]{});
        expectedOutput = "In: 11 10 9 8 7 6 5 4 3 2 1 0 ";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);

        // Reset the output stream for the next test
        outContent.reset();

        simulatedInput = "20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E8ForLoop.main(new String[]{});
        expectedOutput = "In: 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 ";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
