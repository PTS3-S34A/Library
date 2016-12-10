package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.HandbrakeAction;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the HandbrakeAction enumeration.
 *
 * @author PTS34A
 */
public class HandbrakeActionTest {

    // Declaration of test object.
    private HandbrakeAction handbrakeAction;

    @Before
    public void setUp() {
        handbrakeAction = HandbrakeAction.ACTIVE;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, handbrakeAction.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(HandbrakeAction.ACTIVE, HandbrakeAction.parse(0));
        assertEquals(HandbrakeAction.INACTIVE, HandbrakeAction.parse(1));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        HandbrakeAction.parse(10);
    }

}
