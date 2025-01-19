package week3.d4.e5test;

import org.example.week3.d4.e5.E5NestedIfAndScanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5NestedIfAndScannerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String lineSeparator = System.lineSeparator();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testLargestNumberFirst() {
        String input = "14 5 4" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + lineSeparator +
                "The largest number is 14" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testLargestNumberSecond() {
        String input = "4 14 5" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + lineSeparator +
                "The largest number is 14" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testLargestNumberThird() {
        String input = "5 4 14" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + lineSeparator +
                "The largest number is 14" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }



    @Test
    public void testNegativeNumbers() {
        String input = "-10 -5 -20" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter 3 distinct numbers separated by spaces" + lineSeparator +
                "The largest number is -5" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}
