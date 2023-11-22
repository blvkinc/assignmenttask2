package base;

import java.net.InetAddress;

public class ConnectionGenius {

    private final InetAddress ipAddress;

    public ConnectionGenius(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void startGame() {
        downloadWebVersion();
        connectToWebService();
        launchGame();
    }

    private void downloadWebVersion() {
        System.out.println("Getting specialized web version.");
        System.out.println("Please wait...");  
    }

    private void connectToWebService() {
        System.out.println("Connecting to web service...");
    }

    private void launchGame() {
        System.out.println("Game is ready to play.");
    }

    public InetAddress getIpAddress() {
        return ipAddress;
    }
}


