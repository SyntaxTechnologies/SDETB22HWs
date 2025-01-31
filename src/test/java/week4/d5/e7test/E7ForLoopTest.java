package week4.d5.e7test;

import org.example.week4.d5.e7.E7ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E7ForLoopTest {

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
    void testForLoopWithInput3() {
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E7ForLoop.main(new String[]{});
        String expectedOutput = "In: 0 1 2 ";

        String failureMessage = "The output does not match the expected values for the input 3.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers based on user input.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testForLoopWithInput8() {
        String simulatedInput = "8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E7ForLoop.main(new String[]{});
        String expectedOutput = "In: 0 1 2 3 4 5 6 7 ";

        String failureMessage = "The output does not match the expected values for the input 8.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers based on user input.";

        assertEquals((expectedOutput), (outContent.toString()), failureMessage);
    }

    @Test
    void testForLoopWithInput5() {
        String simulatedInput = "5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E7ForLoop.main(new String[]{});
        String expectedOutput = "In: 0 1 2 3 4 ";

        String failureMessage = "The output does not match the expected values for the input 5.\n" +
                "Please ensure that your program correctly uses the for loop to print a series of numbers based on user input.";

        assertEquals((expectedOutput), (outContent.toString()), failureMessage);
    }
}
