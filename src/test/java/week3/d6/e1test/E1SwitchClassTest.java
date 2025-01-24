package week3.d6.e1test;

import org.example.week3.d6.e1.E1SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1SwitchClassTest {

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
    void testAsghar() {
        String simulatedInput = "Asghar\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                "Will take care of Java Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Asghar.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testMoazzam() {
        String simulatedInput = "Moazzam\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                "Will take care of SDLC Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Moazzam.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testWeqas() {
        String simulatedInput = "Weqas\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                "Will take care of Selenium Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Weqas.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testAsel() {
        String simulatedInput = "Asel\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                "Will take care of every Assignment" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for Asel.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidInstructor() {
        String simulatedInput = "John\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1SwitchClass.main(new String[]{});
        String expectedOutput = "Enter name of the instructor" + System.lineSeparator() +
                "Invalid instructor selected" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for an invalid instructor.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
