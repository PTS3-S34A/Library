package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.ThrottleAction;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the ThrottleAction enumeration.
 *
 * @author PTS34A
 */
public class ThrottleActionTest {

    // Declaration of test object.
    private ThrottleAction throttleAction;

    @Before
    public void setUp() {
        throttleAction = ThrottleAction.IDLE;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, throttleAction.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(ThrottleAction.IDLE, ThrottleAction.parse(0));
        assertEquals(ThrottleAction.ACCELERATE, ThrottleAction.parse(1));
        assertEquals(ThrottleAction.REVERSE, ThrottleAction.parse(2));
        assertEquals(ThrottleAction.BOOST, ThrottleAction.parse(3));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        ThrottleAction.parse(10);
    }

}
