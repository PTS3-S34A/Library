package nl.soccar.library.test;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.soccar.library.Notification;
import nl.soccar.library.Player;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.Privilege;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Notification class.
 *
 * @author PTS34A
 */
public class NotificationTest {

    private static final Logger LOGGER = Logger.getLogger(NotificationTest.class.getSimpleName());

    // Declaration of test objects.
    private Notification notification;
    private Player player;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        notification = new Notification(1.0F, 2.0F, 3.0F, 4);
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
    }

    @Test
    public void moveTest() {
        float newX = 1.0F;
        float newY = 1.0F;
        float newDegree = 1.0F;

        notification.move(newX, newY, newDegree);

        assertSame(Math.round(newX), Math.round(notification.getX()));
        assertSame(Math.round(newY), Math.round(notification.getY()));
        assertSame(Math.round(newDegree), Math.round(notification.getDegree()));
    }

    /**
     * Tests the getX method.
     */
    @Test
    public void getXTest() {
        assertEquals(Math.round(1.0F), Math.round(notification.getX()));
    }

    /**
     * Tests the getY method.
     */
    @Test
    public void getYTest() {
        assertEquals(Math.round(2.0F), Math.round(notification.getY()));
    }

    /**
     * Tests the getDegree method.
     */
    @Test
    public void getDegreeTest() {
        assertEquals(Math.round(3.0F), Math.round(notification.getDegree()));
    }

    /**
     * Tests the getPlayer and setPlayer methods.
     */
    @Test
    public void getPlayerAndSetPlayerTest() {
        notification.setPlayer(player);
        assertEquals(player, notification.getPlayer());
    }

    /**
     * Tests the setDisplayTime and isActive methods.
     */
    @Test
    public void setDisplayTimeAndIsActiveTest() {
        notification.setDisplayTime(LocalTime.now());
        assertTrue(notification.isActive());
        
        // Wait for five seconds so that the notification becomes unactive.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "An error occurred while temporarily ceasing execution during the setDisplayTime and isActive methods", e);
        }
        
        assertFalse(notification.isActive());
    }

    /**
     * Tests the getContent method.
     */
    @Test
    public void getContentTest() {
        notification.setPlayer(player);
        assertEquals(String.format("%s %s", player.getUsername(), "SCORED!"), notification.getContent());
    }

}
