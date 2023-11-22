package base;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.mockito.Mockito.*;

class ConnectionGeniusTest {

    @Test
    void testStartGame() throws UnknownHostException {
        // Mocking InetAddress since it's a concrete class
        InetAddress mockedAddress = mock(InetAddress.class);
        ConnectionGenius connectionGenius = new ConnectionGenius(mockedAddress);

        // Mocking the methods
        ConnectionGenius spyConnectionGenius = Mockito.spy(connectionGenius);
        doNothing().when(spyConnectionGenius).downloadWebVersion();
        doNothing().when(spyConnectionGenius).connectToWebService();
        doNothing().when(spyConnectionGenius).launchGame();

        // Testing the method
        spyConnectionGenius.startGame();

        // Verifying if the methods were called
        verify(spyConnectionGenius, times(1)).downloadWebVersion();
        verify(spyConnectionGenius, times(1)).connectToWebService();
        verify(spyConnectionGenius, times(1)).launchGame();
    }
}
