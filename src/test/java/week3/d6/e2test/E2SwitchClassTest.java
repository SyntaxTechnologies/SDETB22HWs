package week3.d6.e2test;

import org.example.week3.d6.e2.E2SwitchClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2SwitchClassTest {

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
    void testBreakfast() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                "The price of your meal is $5.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for breakfast.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testLunch() {
        String simulatedInput = "2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                "The price of your meal is $10.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for lunch.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testDinner() {
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                "The price of your meal is $15.0" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for dinner.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    @Test
    void testInvalidMealType() {
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E2SwitchClass.main(new String[]{});
        String expectedOutput = "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)" + System.lineSeparator() +
                "Invalid meal type entered" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for invalid meal type.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
