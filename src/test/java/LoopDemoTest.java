import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopDemoTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream capturedOut;

    @BeforeEach
    void redirectStdout() {
        capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut, true));
    }

    @AfterEach
    void restoreStdout() {
        System.setOut(originalOut);
    }

    @Test
    void main_printsExpectedValueFromLoopEnd() {
        LoopDemo.main(new String[0]);

        String printed = capturedOut.toString().trim();
        assertEquals("10", printed, "System.out.println should output the int after the 0..<10 loop");
    }
}
