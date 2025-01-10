package week1.d6.e4test;


import org.example.week1.d6.e4.E4ArithmeticOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class E4ArithmeticOperationsTest {
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
    void testRectangleCalculations() {
        E4ArithmeticOperations.main(new String[]{});
        String expectedOutput = "The perimeter of a rectangle with width 5 and height 8 is equal to 26 and the area equals to 40" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares variables 'width' and 'height',\n" +
                "calculates the perimeter and area, and prints the results in the specified format.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
