package week4.d5.e4test;

import org.example.week4.d5.e4.E4ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4ForLoopTest {

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
    void testForLoop() {
        E4ForLoop.main(new String[]{});
        String expectedOutput = "10" + System.lineSeparator() +
                "9" + System.lineSeparator() +
                "8" + System.lineSeparator() +
                "7" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "5" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "1" + System.lineSeparator() +
                "Happy New Year!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print the countdown and the 'Happy New Year!' message.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
