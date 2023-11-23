package base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import static org.junit.jupiter.api.Assertions.*;

class PictureFrameTest {

    private PictureFrame pictureFrame;

    @BeforeEach
    void setUp() {
        pictureFrame = new PictureFrame();
    }

    @Test
    void testCreatePictureFrame() {
        Main main = new Main();
        pictureFrame.createPictureFrame(main);
        assertNotNull(pictureFrame.dp);
        assertTrue(pictureFrame.dp instanceof JPanel);

        JFrame frame = (JFrame) pictureFrame.dp.getParent();
        assertNotNull(frame);
        assertEquals("Abominodo", frame.getTitle());
        assertEquals(JFrame.DO_NOTHING_ON_CLOSE, frame.getDefaultCloseOperation());
        assertTrue(frame.isVisible());
    }

    @Test
    void testReset() {
        // TODO: Implement the test for the reset method
    }
}