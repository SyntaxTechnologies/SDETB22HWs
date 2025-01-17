package week2.d6.e3test;


import org.example.week2.d6.e3.E3ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3ElseIfTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testBGrade() {
        E3ElseIf.main(new String[]{});
        String expectedOutput = "Your grade is: B" + System.lineSeparator();
        String failureMessage = "The output does not match the expected grade.\n" +
                "Please ensure that your program calculates and prints the correct grade.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
