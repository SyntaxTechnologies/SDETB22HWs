package week4.d5.e1test;


import org.example.week4.d5.e1.E1ForLoop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1ForLoopTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testForLoopExample() {
        E1ForLoop.main(new String[]{});

        // Define the expected output
        String expectedOutput = "2\n4\n6\n8\n10\n12\n14\n";
        String failureMessage ="Create a for loop that prints out even numbers from 2 to 14 using if condition\n" +
                "Must include the number 14 in the output\n" +
                "Output:\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10\n" +
                "12\n" +
                "14";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString().replace("\r\n", "\n"));
    }
}
