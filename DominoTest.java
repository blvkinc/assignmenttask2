import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoTest {

    @Test
    void testPlace() {
        Domino domino = new Domino(3, 4);
        domino.place(1, 2, 3, 4);
        assertTrue(domino.isPlaced());
        assertEquals(1, domino.getHx());
        assertEquals(2, domino.getHy());
        assertEquals(3, domino.getLx());
        assertEquals(4, domino.getLy());
    }

    @Test
    void testToStringUnplaced() {
        Domino domino = new Domino(3, 4);
        String expected = "[34]unplaced";
        assertEquals(expected, domino.toString());
    }

    @Test
    void testToStringPlaced() {
        Domino domino = new Domino(3, 4);
        domino.place(1, 2, 3, 4);
        String expected = "[34](2,3)(4,5)";
        assertEquals(expected, domino.toString());
    }

    @Test
    void testInvert() {
        Domino domino = new Domino(3, 4);
        domino.place(1, 2, 3, 4);
        domino.invert();
        assertEquals(3, domino.getHx());
        assertEquals(4, domino.getHy());
        assertEquals(1, domino.getLx());
        assertEquals(2, domino.getLy());
    }

    @Test
    void testIsHorizontal() {
        Domino horizontalDomino = new Domino(3, 4);
        horizontalDomino.place(1, 2, 3, 2);
        assertTrue(horizontalDomino.isHorizontal());

        Domino verticalDomino = new Domino(3, 4);
        verticalDomino.place(1, 2, 1, 4);
        assertFalse(verticalDomino.isHorizontal());
    }

    @Test
    void testCompareTo() {
        Domino domino1 = new Domino(3, 4);
        Domino domino2 = new Domino(5, 2);
        Domino domino3 = new Domino(3, 6);

        assertTrue(domino1.compareTo(domino2) < 0);
        assertTrue(domino2.compareTo(domino1) > 0);
        assertEquals(0, domino1.compareTo(domino3));
    }
}