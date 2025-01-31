package week4.d5.e3test;

import org.example.week4.d5.e3.E3ForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3ForLoopTest {

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
        E3ForLoop.main(new String[]{});
        String expectedOutput = "Hey, it is year:" + System.lineSeparator() +
                                "2011" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2012" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2013" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2014" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2015" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2016" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2017" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2018" + System.lineSeparator() +
                                "Hey, it is year:" + System.lineSeparator() +
                                "2019" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the for loop.\n" +
                "Please ensure that your program correctly uses the for loop to print 'Hey, it is year:' followed by the year.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
