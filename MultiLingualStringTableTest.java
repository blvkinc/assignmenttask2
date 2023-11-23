import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiLingualStringTableTest {

    @Test
    void testGetMessageEnglish() {
        MultiLingualStringTable.cl = MultiLingualStringTable.LanguageSetting.English;
        assertEquals("Enter your name:", MultiLingualStringTable.getMessage(0));
        assertEquals("Welcome", MultiLingualStringTable.getMessage(1));
        assertEquals("Have a good time playing Abominodo", MultiLingualStringTable.getMessage(2));
    }

    @Test
    void testGetMessageKlingon() {
        MultiLingualStringTable.cl = MultiLingualStringTable.LanguageSetting.Klingon;
        assertEquals("'el lIj pong:", MultiLingualStringTable.getMessage(0));
        assertEquals("nuqneH", MultiLingualStringTable.getMessage(1));
        assertEquals("QaQ poH Abominodo", MultiLingualStringTable.getMessage(2));
    }
}