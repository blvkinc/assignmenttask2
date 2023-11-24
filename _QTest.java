package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _QTest {
    @Test
    public void testGetQuotes() {
        String[] quotes = Quotes.getQuotes();

        assertNotNull(quotes);
        assertEquals(26, quotes.length);

        for (String quote : quotes) {
            assertFalse(quote.isEmpty());
        }
    }
}
