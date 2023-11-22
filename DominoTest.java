package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoTest {

    @Test
    void testPlace() {
        Domino domino = new Domino(3, 4);
        domino.place(1, 2, 3, 4);
        assertTrue(domino.isHorizontal());
        assertTrue(domino.toString().contains("(2,3)"));
    }

    @Test
    void testInvert() {
        Domino domino = new Domino(5, 6);
        domino.place(1, 2, 3, 4);
        domino.invert();
        assertFalse(domino.isHorizontal());
        assertTrue(domino.toString().contains("(4,3)"));
    }

    @Test
    void testCompareTo() {
        Domino domino1 = new Domino(3, 4);
        Domino domino2 = new Domino(5, 6);

        assertTrue(domino1.compareTo(domino2) < 0);
        assertEquals(0, domino1.compareTo(domino1));
    }
}
