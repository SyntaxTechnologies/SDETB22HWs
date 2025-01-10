package week1.d6.e2test;

import org.example.week1.d6.e2.E2ArithmeticOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class E2ArithmeticOperationsTest {


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
    void testArithmeticOperations() {
        E2ArithmeticOperations.main(new String[]{});
        String expectedOutput = "The multiplication of 8.2 with itself is equal to 67.24" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates a float variable with the value 8.2, multiplies it by itself, and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }





}
