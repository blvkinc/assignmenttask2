package base;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IOLibraryTest {

    @Test
    void testGetString() throws IOException {
        String testString = "Hello, World!";
        InputStream inputStream = new ByteArrayInputStream(testString.getBytes());
        System.setIn(inputStream);
        String input = IOLibrary.getString();
        assertEquals(testString, input);
    }

    @Test
    void testGetIPAddress() throws IOException {
        String ipAddressString = "192.168.1.1";
        InputStream inputStream = new ByteArrayInputStream(ipAddressString.getBytes());
        System.setIn(inputStream);
        InetAddress ipAddress = IOLibrary.getIPAddress();
        assertEquals(ipAddressString, ipAddress.getHostAddress());
    }

    @Test
    void testInvalidIPAddressInput() {
        String invalidIPAddressString = "invalid";
        InputStream inputStream = new ByteArrayInputStream(invalidIPAddressString.getBytes());
        System.setIn(inputStream);
        assertThrows(Exception.class, IOLibrary::getIPAddress);
    }
}
