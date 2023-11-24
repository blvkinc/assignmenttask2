package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

public final class IOLibrary {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getString() {
        do {
            try {
                return reader.readLine();
            } catch (IOException ignored) {
            }
        } while (true);
    }

    public static InetAddress getIPAddress() {
        do {
            try {
                String[] chunks = reader.readLine().split("\\.");
                byte[] data = {
                        Byte.parseByte(chunks[0]),
                        Byte.parseByte(chunks[1]),
                        Byte.parseByte(chunks[2]),
                        Byte.parseByte(chunks[3])
                };
                return Inet4Address.getByAddress(data);
            } catch (Exception ignored) {
            }
        } while (true);
    }
}
