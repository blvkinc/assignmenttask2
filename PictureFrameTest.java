package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PictureFrameTest {

    @Test
    void testPictureFrameInitialization() {
        Main main = new Main();
        PictureFrame pictureFrame = new PictureFrame(main);
        assertNotNull(pictureFrame);
        assertNotNull(pictureFrame.dp);
    }
}
