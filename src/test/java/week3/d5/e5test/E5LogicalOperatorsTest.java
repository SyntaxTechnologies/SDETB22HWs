package week3.d5.e5test;

import org.example.week3.d5.e5.E5LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5LogicalOperatorsTest {

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
    void testGradeA() {
        String simulatedInput = "85\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is A" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade A.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidMark() {
        String simulatedInput = "-5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Please enter a valid mark" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for invalid mark.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeB() {
        String simulatedInput = "75\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is B" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade B.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeC() {
        String simulatedInput = "55\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is C" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade C.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeD() {
        String simulatedInput = "50\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is D" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade D.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeE() {
        String simulatedInput = "40\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is E" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade E.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testGradeF() {
        String simulatedInput = "20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E5LogicalOperators.main(new String[]{});
        String expectedOutput = "Please enter your mark" + System.lineSeparator() +
                "Your grade is F" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for grade F.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
