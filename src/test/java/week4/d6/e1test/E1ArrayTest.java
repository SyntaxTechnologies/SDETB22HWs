package week4.d6.e1test;

import org.example.week4.d6.e1.E1Array;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1ArrayTest {

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
        E1Array.main(new String[]{});
        String expectedOutput = "45 78 12 67 55 ";

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly creates the array and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
