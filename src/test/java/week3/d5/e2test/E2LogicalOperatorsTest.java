package week3.d5.e2test;

import org.example.week3.d5.e2.E2LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2LogicalOperatorsTest {

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
    void testPrioritizingEssentialsWell() {
        String simulatedInput = "1200\n600\n300\n200\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                "Please enter your monthly food expense" + System.lineSeparator() +
                "Please enter your monthly transportation expense" + System.lineSeparator() +
                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                "You are prioritizing essentials well." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values when prioritizing essentials well.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testOnTheRightTrack() {
        String simulatedInput = "1200\n800\n300\n400\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                "Please enter your monthly food expense" + System.lineSeparator() +
                "Please enter your monthly transportation expense" + System.lineSeparator() +
                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                "You are on the right track, but could improve." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values when on the right track.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNeedToRethinkSpendingPriorities() {
        String simulatedInput = "1000\n1200\n200\n300\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your monthly rent expense" + System.lineSeparator() +
                "Please enter your monthly food expense" + System.lineSeparator() +
                "Please enter your monthly transportation expense" + System.lineSeparator() +
                "Please enter your monthly entertainment expense" + System.lineSeparator() +
                "You need to rethink your spending priorities." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values when needing to rethink spending priorities.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
