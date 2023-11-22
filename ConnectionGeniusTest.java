import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.InetAddress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ConnectionGeniusTest {

    @Test
    void testFireUpGame() {
        ConnectionGenius connectionGenius = Mockito.spy(new ConnectionGenius(null));

        doNothing().when(connectionGenius).downloadWebVersion();
        doNothing().when(connectionGenius).connectToWebService();
        doNothing().when(connectionGenius).awayWeGo();

        connectionGenius.fireUpGame();

        verify(connectionGenius).downloadWebVersion();
        verify(connectionGenius).connectToWebService();
        verify(connectionGenius).awayWeGo();
    }

    @Test
    void testDownloadWebVersion() {
        ConnectionGenius connectionGenius = new ConnectionGenius(null);

        // Redirect System.out to a mock PrintStream
        System.setOut(new PrintStream(new ByteArrayOutputStream()));

        connectionGenius.downloadWebVersion();

        // Verify that the expected output is printed
        assertEquals("Getting specialized web version.\nWait a couple of moments\n", outContent.toString());
    }

    @Test
    void testConnectToWebService() {
        ConnectionGenius connectionGenius = new ConnectionGenius(null);

        // Redirect System.out to a mock PrintStream
        System.setOut(new PrintStream(new ByteArrayOutputStream()));

        connectionGenius.connectToWebService();

        // Verify that the expected output is printed
        assertEquals("Connecting\n", outContent.toString());
    }

    @Test
    void testAwayWeGo() {
        ConnectionGenius connectionGenius = new ConnectionGenius(null);

        // Redirect System.out to a mock PrintStream
        System.setOut(new PrintStream(new ByteArrayOutputStream()));

        connectionGenius.awayWeGo();

        // Verify that the expected output is printed
        assertEquals("Ready to play\n", outContent.toString());
    }
}