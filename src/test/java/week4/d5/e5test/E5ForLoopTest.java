package week4.d5.e5test;

import org.example.week4.d5.e5.E5ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5ForLoopTest {

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
    void testForLoop() {
        E5ForLoop.main(new String[]{});
        String expectedOutput = "3*1=3" + System.lineSeparator() +
                                "3*2=6" + System.lineSeparator() +
                                "3*3=9" + System.lineSeparator() +
                                "3*4=12" + System.lineSeparator() +
                                "3*5=15" + System.lineSeparator() +
                                "3*6=18" + System.lineSeparator() +
                                "3*7=21" + System.lineSeparator() +
                                "3*8=24" + System.lineSeparator() +
                                "3*9=27" + System.lineSeparator() +
                                "3*10=30" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print the multiplication table of 3.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
