package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocationTest {

    @Test
    void testToStringWithoutDirection() {
        Location location = new Location(2, 3);
        String expected = "(4,3)";
        String actual = location.toString();
        assertEquals(expected, actual);
    }

    @Test
    void testToStringWithDirection() {
        Location location = new Location(5, 6, Location.DIRECTION.VERTICAL);
        String expected = "(7,6,VERTICAL)";
        String actual = location.toString();
        assertEquals(expected, actual);
    }
}
