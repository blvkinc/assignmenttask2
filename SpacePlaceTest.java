import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpacePlaceTest {

    @Test
    void testDefaultConstructor() {
        SpacePlace spacePlace = new SpacePlace();
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(0.0, spacePlace.getTheta());
        assertEquals(0.0, spacePlace.getPhi());
    }

    @Test
    void testConstructorWithThetaAndPhi() {
        double theta = 1.5;
        double phi = 2.5;
        SpacePlace spacePlace = new SpacePlace(theta, phi);
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(theta, spacePlace.getTheta());
        assertEquals(phi, spacePlace.getPhi());
    }

    @Test
    void testSettersAndGetters() {
        SpacePlace spacePlace = new SpacePlace();
        int xOrg = 10;
        int yOrg = 20;
        double theta = 1.5;
        double phi = 2.5;

        spacePlace.setxOrg(xOrg);
        spacePlace.setyOrg(yOrg);
        spacePlace.setTheta(theta);
        spacePlace.setPhi(phi);

        assertEquals(xOrg, spacePlace.getxOrg());
        assertEquals(yOrg, spacePlace.getyOrg());
        assertEquals(theta, spacePlace.getTheta());
        assertEquals(phi, spacePlace.getPhi());
    }
}import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpacePlaceTest {

    @Test
    void testDefaultConstructor() {
        SpacePlace spacePlace = new SpacePlace();
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(0.0, spacePlace.getTheta());
        assertEquals(0.0, spacePlace.getPhi());
    }

    @Test
    void testConstructorWithThetaAndPhi() {
        double theta = 1.5;
        double phi = 2.5;
        SpacePlace spacePlace = new SpacePlace(theta, phi);
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(theta, spacePlace.getTheta());
        assertEquals(phi, spacePlace.getPhi());
    }

    @Test
    void testSettersAndGetters() {
        SpacePlace spacePlace = new SpacePlace();
        int xOrg = 10;
        int yOrg = 20;
        double theta = 1.5;
        double phi = 2.5;

        spacePlace.setxOrg(xOrg);
        spacePlace.setyOrg(yOrg);
        spacePlace.setTheta(theta);
        spacePlace.setPhi(phi);

        assertEquals(xOrg, spacePlace.getxOrg());
        assertEquals(yOrg, spacePlace.getyOrg());
        assertEquals(theta, spacePlace.getTheta());
        assertEquals(phi, spacePlace.getPhi());
    }
    
    @Test
    void testSettersAndGettersWithNegativeValues() {
        SpacePlace spacePlace = new SpacePlace();
        int xOrg = -10;
        int yOrg = -20;
        double theta = -1.5;
        double phi = -2.5;

        spacePlace.setxOrg(xOrg);
        spacePlace.setyOrg(yOrg);
        spacePlace.setTheta(theta);
        spacePlace.setPhi(phi);

        assertEquals(xOrg, spacePlace.getxOrg());
        assertEquals(yOrg, spacePlace.getyOrg());
        assertEquals(theta, spacePlace.getTheta());
        assertEquals(phi, spacePlace.getPhi());
    }
}