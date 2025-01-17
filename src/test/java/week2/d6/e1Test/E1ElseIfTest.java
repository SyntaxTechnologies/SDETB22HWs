package week2.d6.e1Test;

import org.example.week2.d6.e1.E1ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1ElseIfTest {

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
    void testWithinBudget() {
        // Simulate the program with expenses within budget
        E1ElseIf.main(new String[]{});
        String expectedOutput = "Your total daily expense is: 76.25" + System.lineSeparator() +
                "You are within the budget." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program calculates and checks the total expense correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
