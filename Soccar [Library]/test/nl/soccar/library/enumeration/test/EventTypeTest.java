package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.EventType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests the EventType enumeration.
 *
 * @author PTS34A
 */
public class EventTypeTest {

    // Declaration of test object.
    private EventType eventType;

    @Before
    public void setUp() {
        eventType = EventType.GOAL_RED;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, eventType.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(EventType.GOAL_RED, EventType.parse(0));
        assertEquals(EventType.GOAL_BLUE, EventType.parse(1));
        assertEquals(EventType.ASSIST, EventType.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        EventType.parse(10);
    }

}
