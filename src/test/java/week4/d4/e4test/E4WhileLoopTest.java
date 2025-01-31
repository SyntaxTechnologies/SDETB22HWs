package week4.d4.e4test;

import org.example.week4.d4.e4.E4WhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4WhileLoopTest {

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
    void testWhileLoop() {
        E4WhileLoop.main(new String[]{});
        String expectedOutput = "7" + System.lineSeparator() +
                                "14" + System.lineSeparator() +
                                "21" + System.lineSeparator() +
                                "28" + System.lineSeparator() +
                                "35" + System.lineSeparator() +
                                "42" + System.lineSeparator() +
                                "49" + System.lineSeparator() +
                                "56" + System.lineSeparator() +
                                "63" + System.lineSeparator() +
                                "70" + System.lineSeparator() +
                                "77" + System.lineSeparator() +
                                "84" + System.lineSeparator() +
                                "91" + System.lineSeparator() +
                                "98" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the while loop.\n" +
                "Please ensure that your program correctly uses the while loop to print the sequence from 7 to 98.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
