package nl.soccar.library.test;

import nl.soccar.library.Obstacle;
import nl.soccar.library.enumeration.ObstacleType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Obstacle class.
 *
 * @author PTS34A
 */
public class ObstacleTest {

    // Declaration of test object.
    private Obstacle obstacle;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        obstacle = new Obstacle(1.0F, 2.0F, 3.0F, 10.0F, 20.0F, ObstacleType.WALL);
    }
    
        @Test
    public void moveTest() {
        float newX = 1.0F;
        float newY = 1.0F;
        float newDegree = 1.0F;

        obstacle.move(newX, newY, newDegree);

        assertSame(Math.round(newX), Math.round(obstacle.getX()));
        assertSame(Math.round(newY), Math.round(obstacle.getY()));
        assertSame(Math.round(newDegree), Math.round(obstacle.getDegree()));
    }

    /**
     * Tests the getX method.
     */
    @Test
    public void getXTest() {
        assertEquals(Math.round(1.0F), Math.round(obstacle.getX()));
    }

    /**
     * Tests the getY method.
     */
    @Test
    public void getYTest() {
        assertEquals(Math.round(2.0F), Math.round(obstacle.getY()));
    }

    /**
     * Tests the getDegree method.
     */
    @Test
    public void getDegreeTest() {
        assertEquals(Math.round(3.0F), Math.round(obstacle.getDegree()));
    }

    /**
     * Tests the getWidth method.
     */
    @Test
    public void getWidthTest() {
        assertEquals(Math.round(10.0F), Math.round(obstacle.getWidth()));
    }

    /**
     * Tests the getHeight method.
     */
    @Test
    public void getHeightTest() {
        assertEquals(Math.round(20.0F), Math.round(obstacle.getHeight()));
    }

    /**
     * Tests the getObstacleType method.
     */
    @Test
    public void getObstacleTypeTest() {
        assertEquals(ObstacleType.WALL, obstacle.getObstacleType());
    }

}
