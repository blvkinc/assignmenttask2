package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiLingualStringTableTest {

    @Test
    void testGetMessageInEnglish() {
        MultiLingualStringTable.LanguageSetting language = MultiLingualStringTable.LanguageSetting.ENGLISH;

        MultiLingualStringTable.getMessage(0);
        String expected = "Enter your name:";
        String actual = MultiLingualStringTable.getMessage(0);

        assertEquals(expected, actual);
    }

    @Test
    void testGetMessageInKlingon() {
        MultiLingualStringTable.LanguageSetting language = MultiLingualStringTable.LanguageSetting.KLINGON;

        MultiLingualStringTable.getMessage(1);
        String expected = "nuqneH";
        String actual = MultiLingualStringTable.getMessage(1);

        assertEquals(expected, actual);
    }
}
