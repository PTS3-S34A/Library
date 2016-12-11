package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.SteerAction;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the SteerAction enumeration.
 *
 * @author PTS34A
 */
public class SteerActionTest {

    // Declaration of test object.
    private SteerAction steerAction;

    @Before
    public void setUp() {
        steerAction = SteerAction.NONE;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, steerAction.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(SteerAction.NONE, SteerAction.parse(0));
        assertEquals(SteerAction.STEER_LEFT, SteerAction.parse(1));
        assertEquals(SteerAction.STEER_RIGHT, SteerAction.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        SteerAction.parse(10);
    }

}
