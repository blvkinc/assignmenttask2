package base;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IOSpecialistTest {

    @Test
    void testGetString() throws IOException {
        String testString = "Hello, World!";
        InputStream inputStream = new ByteArrayInputStream(testString.getBytes());
        System.setIn(inputStream);

        IOSpecialist ioSpecialist = new IOSpecialist();
        String input = ioSpecialist.getString();

        assertEquals(testString, input);
    }
}
