package week4.d6.e4test;

import org.example.week4.d6.e4.E4Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4ArraysTester {

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
    void testArrayValues() {
        E4Arrays.main(new String[]{});
        String expectedOutput = "This is array of strings " ;

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly creates the array and prints all values in one line.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
