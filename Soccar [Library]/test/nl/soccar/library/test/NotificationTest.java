package nl.soccar.library.test;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import nl.soccar.library.Notification;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Notification class.
 *
 * @author PTS34A
 */
public class NotificationTest {

    // Declaration of test objects.
    private Font font;
    private Notification notification;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        font = new Font("Font", 1);
        notification = new Notification(1.0F, 2.0F, 3.0F, "content", font, Color.BLACK, Color.BLUE);
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
     * Tests the getContent method.
     */
    @Test
    public void getContentTest() {
        assertEquals("content", notification.getContent());
    }

    /**
     * Tests the getFont method.
     */
    @Test
    public void getFontTest() {
        assertEquals(font, notification.getFont());
    }

    /**
     * Tests the getStroke method.
     */
    @Test
    public void getStrokeTest() {
        assertEquals(Color.BLUE, notification.getStroke());
    }

    /**
     * Tests the getStroke method.
     */
    @Test
    public void getFillTest() {
        assertEquals(Color.BLACK, notification.getFill());
    }

}
