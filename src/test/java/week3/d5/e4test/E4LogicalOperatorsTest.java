package week3.d5.e4test;

import org.example.week3.d5.e4.E4LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4LogicalOperatorsTest {

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
    void testWeekendAndAvailable() {
        String simulatedInput = "true\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E4LogicalOperators.main(new String[]{});
        String expectedOutput = "Is it weekend? (true/false)" + System.lineSeparator() +
                "Are you available? (true/false)" + System.lineSeparator() +
                "Today you will be learning Java" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for weekend and available.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotWeekendButAvailable() {
        String simulatedInput = "false\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E4LogicalOperators.main(new String[]{});
        String expectedOutput = "Is it weekend? (true/false)" + System.lineSeparator() +
                "Are you available? (true/false)" + System.lineSeparator() +
                "Today you will be learning manual testing" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not weekend but available.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotAvailable() {
        String simulatedInput = "true\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E4LogicalOperators.main(new String[]{});
        String expectedOutput = "Is it weekend? (true/false)" + System.lineSeparator() +
                "Are you available? (true/false)" + System.lineSeparator() +
                "Today you will be learning no subject" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not available.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
