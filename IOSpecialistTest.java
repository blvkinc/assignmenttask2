import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IOSpecialistTest {

    @Test
    void testGetString() {
        IOSpecialist ioSpecialist = new IOSpecialist();
        String input = "Hello, World!";
        IOLibrary.setInput(input);
        String result = ioSpecialist.getString();
        assertEquals(input, result);
    }
}import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IOSpecialistTest {

    @Test
    void testGetString() {
        IOSpecialist ioSpecialist = new IOSpecialist();
        String input = "Hello, World!";
        IOLibrary.setInput(input);
        String result = ioSpecialist.getString();
        assertEquals(input, result);
    }

    @Test
    void testGetStringEmptyInput() {
        IOSpecialist ioSpecialist = new IOSpecialist();
        String input = "";
        IOLibrary.setInput(input);
        String result = ioSpecialist.getString();
        assertEquals(input, result);
    }

    @Test
    void testGetStringNullInput() {
        IOSpecialist ioSpecialist = new IOSpecialist();
        String input = null;
        IOLibrary.setInput(input);
        String result = ioSpecialist.getString();
        assertEquals(input, result);
    }
}