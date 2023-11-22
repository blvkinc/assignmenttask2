import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

class IOLibraryTest {

    @Test
    void testGetString() {
        String input = "Hello, World!";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        String result = IOLibrary.getString();

        System.setIn(stdin);

        assertEquals(input, result);
    }

    @Test
    void testGetIPAddress() {
        String input = "192.168.0.1";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try {
            InetAddress result = IOLibrary.getIPAddress();
            InetAddress expected = InetAddress.getByName(input);

            assertEquals(expected, result);
        } catch (UnknownHostException e) {
            fail("Failed to resolve IP address");
        }

        System.setIn(stdin);
    }
}