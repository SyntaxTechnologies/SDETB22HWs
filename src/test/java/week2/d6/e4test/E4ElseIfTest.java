package week2.d6.e4test;

import org.example.week2.d6.e4.E4ElseIf;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4ElseIfTest {

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
    void testCalculatorOutput() {
        // Call the main method (no args) assuming it prints all prompts and result
        E4ElseIf.main(new String[]{});

        // Build the expected output, including line separators
        String expectedOutput =
                "Enter operator (+, -, *, /):" + System.lineSeparator() +
                        "Enter first number:" + System.lineSeparator() +
                        "Enter second number:" + System.lineSeparator() +
                        "The product is: 50.0" + System.lineSeparator();

        // Compare captured output with the expected string
        assertEquals(
                expectedOutput,
                outContent.toString(),
                "The output does not match the expected Simple Calculator output."
        );
    }
}