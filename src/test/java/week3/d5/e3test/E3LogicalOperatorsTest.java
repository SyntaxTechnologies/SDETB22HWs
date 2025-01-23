package week3.d5.e3test;

import org.example.week3.d5.e3.E3LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3LogicalOperatorsTest {

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
    void testThirstyNotSleepy() {
        String simulatedInput = "true\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E3LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                "Are you sleepy? (true/false)" + System.lineSeparator() +
                "Looks like you need to drink water" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for thirsty and not sleepy.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testThirstyAndSleepy() {
        String simulatedInput = "true\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E3LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                "Are you sleepy? (true/false)" + System.lineSeparator() +
                "Looks like you need to drink coffee" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for thirsty and sleepy.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotThirstyButSleepy() {
        String simulatedInput = "false\ntrue\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E3LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                "Are you sleepy? (true/false)" + System.lineSeparator() +
                "Looks like you need to drink tea" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not thirsty but sleepy.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testNotThirstyAndNotSleepy() {
        String simulatedInput = "false\nfalse\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E3LogicalOperators.main(new String[]{});
        String expectedOutput = "Are you thirsty? (true/false)" + System.lineSeparator() +
                "Are you sleepy? (true/false)" + System.lineSeparator() +
                "Looks like you need to drink nothing" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for not thirsty and not sleepy.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
