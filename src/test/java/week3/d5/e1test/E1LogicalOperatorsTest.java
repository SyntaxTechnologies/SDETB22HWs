package week3.d5.e1test;

import org.example.week3.d5.e1.E1LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1LogicalOperatorsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testMaybeEligible() {
        String simulatedInput = "true\n650\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Maybe eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Maybe eligible.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotEligible() {
        String simulatedInput = "true\n500\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Not eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Not eligible.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testEligible() {
        String simulatedInput = "true\n750\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Eligible.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testDefinitelyEligible() {
        String simulatedInput = "true\n850\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "What is your credit score?" + System.lineSeparator() +
                "The eligibility is Definitely eligible" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Definitely eligible.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testUnknownEligibility() {
        String simulatedInput = "false\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1LogicalOperators.main(new String[]{});
        String expectedOutput = "Do you need a loan? (true/false)" + System.lineSeparator() +
                "The eligibility is Unknown" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Unknown eligibility.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
