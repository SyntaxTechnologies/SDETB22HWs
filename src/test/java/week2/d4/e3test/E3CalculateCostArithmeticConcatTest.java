package week2.d4.e3test;

import org.example.week2.d4.e3.E3CalculateCostArithmeticConcat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3CalculateCostArithmeticConcatTest {

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
    void testCalculateCost() {
        E3CalculateCostArithmeticConcat.main(new String[]{});
        String expectedOutput = "The total cost is 75.979996" + System.lineSeparator() +
                "The average cost is 18.994999" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares variables 'item1', 'item2', 'item3', and 'item4',\n" +
                "calculates the total cost and average cost, and prints the results in the specified format.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
