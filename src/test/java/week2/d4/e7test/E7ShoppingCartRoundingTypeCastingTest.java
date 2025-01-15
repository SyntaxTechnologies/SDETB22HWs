package week2.d4.e7test;

import org.example.week2.d4.e7.E7ShoppingCartRoundingTypeCasting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E7ShoppingCartRoundingTypeCastingTest {

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
    void testShoppingCartRounding() {
        E7ShoppingCartRoundingTypeCasting.main(new String[]{});
        String expectedOutput = "The original total cost is $54.73" + System.lineSeparator() +
                "The rounded total cost is $54" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares the variables 'item1', 'item2', and 'item3', calculates the total cost, performs type casting correctly, and prints the results as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
