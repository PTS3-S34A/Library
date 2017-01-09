package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.Duration;
import nl.soccar.library.enumeration.ObstacleType;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the ObstacleType enumeration.
 *
 * @author PTS34A
 */
public class ObstacleTypeTest {

    // Declaration of test object.
    private ObstacleType obstacleType;

    @Before
    public void setUp() {
        obstacleType = obstacleType.WALL;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, obstacleType.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(obstacleType.WALL, obstacleType.parse(0));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        ObstacleType.parse(10);
    }

}
