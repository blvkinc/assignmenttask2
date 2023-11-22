import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void testToStringWithoutDirection() {
        Location location = new Location(2, 3);
        assertEquals("(4,3)", location.toString());
    }

    @Test
    void testToStringWithDirection() {
        Location location = new Location(2, 3, Location.DIRECTION.VERTICAL);
        assertEquals("(4,3,VERTICAL)", location.toString());
    }

    @Test
    void testDrawGridLines() {
        // TODO: Implement this test
    }

    @Test
    void testGetInt() {
        String input = "42";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int result = Location.getInt();
        assertEquals(42, result);
    }
}