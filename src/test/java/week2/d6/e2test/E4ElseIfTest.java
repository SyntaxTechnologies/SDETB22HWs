package week2.d6.e2test;
import org.example.week2.d6.e4.E4ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4ElseIfTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        // Redirect System.out to capture outputs
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    /**
     * Utility method to simulate user input.
     *
     * @param data The input data as a single string, inputs separated by newlines.
     */
    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testAddition() {
        // Simulate user input: operator "+", num1 "20", num2 "30"
        String simulatedUserInput = "+\n20\n30\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "The sum is: 50.0" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The addition operation did not produce the expected output.");
    }

    @Test
    void testSubtraction() {
        // Simulate user input: operator "-", num1 "50", num2 "20"
        String simulatedUserInput = "-\n50\n20\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "The difference is: 30.0" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The subtraction operation did not produce the expected output.");
    }

    @Test
    void testMultiplication() {
        // Simulate user input: operator "*", num1 "5", num2 "10"
        String simulatedUserInput = "*\n5\n10\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "The product is: 50.0" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The multiplication operation did not produce the expected output.");
    }

    @Test
    void testDivision() {
        // Simulate user input: operator "/", num1 "100", num2 "20"
        String simulatedUserInput = "/\n100\n20\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "The quotient is: 5.0" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The division operation did not produce the expected output.");
    }

    @Test
    void testDivisionByZero() {
        // Simulate user input: operator "/", num1 "100", num2 "0"
        String simulatedUserInput = "/\n100\n0\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "Cannot divide by zero." + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "Division by zero was not handled correctly.");
    }

    @Test
    void testInvalidOperator() {
        // Simulate user input: operator "%", num1 "10", num2 "20"
        String simulatedUserInput = "%\n10\n20\n";
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        E4ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "Invalid operator" + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "Invalid operator was not handled correctly.");
    }

    @Test
    void testInsufficientArguments() {
        // Simulate user input: operator "+", num1 "10" (missing num2)
        // Note: Java's Scanner will wait for the missing input, causing the test to hang.
        // To prevent this, ensure that the SimpleCalculator handles insufficient inputs gracefully.
        // Alternatively, you can skip implementing this test or modify the main method to handle it.

        // For demonstration, we'll simulate providing no input for num2.
        String simulatedUserInput = "+\n10\n"; // Missing the second number
        provideInput(simulatedUserInput);

        // Run the SimpleCalculator program
        // To prevent the test from hanging indefinitely, you might need to modify the main method
        // to handle cases where insufficient inputs are provided.

        // As an example, if the main method catches NoSuchElementException and prints an error message:
        E4ElseIf.main(new String[]{});

        // Define expected output
        // Assuming the main method prints "Insufficient arguments provided." when inputs are missing.
        String expectedOutput = "Enter operator (+, -, *, /):" + System.lineSeparator()
                + "Enter first number:" + System.lineSeparator()
                + "Enter second number:" + System.lineSeparator()
                + "Insufficient arguments provided." + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "Insufficient arguments were not handled correctly.");
    }
}
