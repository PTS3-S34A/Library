package nl.soccar.library.test;

import nl.soccar.library.Ball;
import nl.soccar.library.Player;
import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.Privilege;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Ball class.
 *
 * @author PTS34A
 */
public class BallTest {

    // Declaration of test object.
    private Ball ball;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        ball = new Ball(1.0F, 2.0F, 3.0F, BallType.HOCKEY);
    }

    /**
     * Tests the move method.
     */
    @Test
    public void moveTest() {
        float newX = 1.0F;
        float newY = 1.0F;
        float newDegree = 1.0F;

        ball.move(newX, newY, newDegree);

        assertEquals(Math.round(newX), Math.round(ball.getX()));
        assertEquals(Math.round(newY), Math.round(ball.getY()));
        assertEquals(Math.round(newDegree), Math.round(ball.getDegree()));
    }

    /**
     * Tests the getX method.
     */
    @Test
    public void getXTest() {
        assertEquals(Math.round(1.0F), Math.round(ball.getX()));
    }

    /**
     * Tests the getY method.
     */
    @Test
    public void getYTest() {
        assertEquals(Math.round(2.0F), Math.round(ball.getY()));
    }

    /**
     * Tests the getDegree method.
     */
    @Test
    public void getDegreeTest() {
        assertEquals(Math.round(3.0F), Math.round(ball.getDegree()));
    }

    /**
     * Tests the getLastTouched and setLastTouched methods.
     */
    @Test
    public void getLastTouchedAndSetLastTouchedTest() {
        Player player = new Player("username", Privilege.GUEST, CarType.CASUAL);
        assertNull(ball.getLastTouched());
        ball.setLastTouched(player);
        assertEquals(player, ball.getLastTouched());

    }

    /**
     * Tests the getRadius method.
     */
    @Test
    public void getRadiusTest() {
        assertEquals(Math.round(3.0F), Math.round(ball.getRadius()));
    }

    /**
     * Tests the getBallTypeAndSetBallType method.
     */
    @Test
    public void getBallTypeTest() {
        assertEquals(BallType.HOCKEY, ball.getBallType());
    }

}
