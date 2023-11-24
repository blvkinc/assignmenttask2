package base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpacePlaceTest {
    @Test
    public void testSettersAndGetters() {
        SpacePlace spacePlace = new SpacePlace();

        spacePlace.setxOrg(10);
        assertEquals(10, spacePlace.getxOrg());

        spacePlace.setyOrg(20);
        assertEquals(20, spacePlace.getyOrg());

        spacePlace.setTheta(45.0);
        assertEquals(45.0, spacePlace.getTheta());

        spacePlace.setPhi(60.0);
        assertEquals(60.0, spacePlace.getPhi());
    }
}
