package week2.d4.e1test;


import org.example.week2.d4.e1.E1StringConcatenation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1StringConcatenationTest {

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
    void testFullNameConcatenation() {
        E1StringConcatenation.main(new String[]{});
        String expectedOutput = "John Smith" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a variable with the value 'John',\n" +
                "creates a variable with the value 'Smith', and prints them concatenated with a space in between.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
