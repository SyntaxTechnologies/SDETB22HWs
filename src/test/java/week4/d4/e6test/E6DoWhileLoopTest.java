package week4.d4.e6test;

import org.example.week4.d4.e6.E6DoWhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E6DoWhileLoopTest {

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
    void testDoWhileLoop() {
        E6DoWhileLoop.main(new String[]{});
        String expectedOutput = "20" + System.lineSeparator() +
                                "18" + System.lineSeparator() +
                                "16" + System.lineSeparator() +
                                "14" + System.lineSeparator() +
                                "12" + System.lineSeparator() +
                                "10" + System.lineSeparator() +
                                "8" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "2" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the do-while loop.\n" +
                "Please ensure that your program correctly uses the do-while loop to print even numbers from 20 to 2.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
