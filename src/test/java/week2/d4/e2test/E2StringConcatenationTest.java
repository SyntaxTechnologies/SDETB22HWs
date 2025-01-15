package week2.d4.e2test;

import org.example.week2.d4.e2.E2StringConcatenation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2StringConcatenationTest {

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
    void testStringConcatenation() {
        E2StringConcatenation.main(new String[]{});
        String expectedOutput = "Java is the #1 programming language" + System.lineSeparator() +
                "syntaxtechs.com" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program creates variables with the correct values ('Java', 'programming language', 'syntax', 'techs.com') and prints them in the correct format.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

}
