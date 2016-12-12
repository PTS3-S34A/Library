package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.BallType;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Tests the BallType enumeration.
 *
 * @author PTS34A
 */
public class BallTypeTest {

    // Declaration of test object.
    private BallType ballType;

    @Before
    public void setUp() {
        ballType = BallType.FOOTBALL;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, ballType.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(BallType.FOOTBALL, BallType.parse(0));
        assertEquals(BallType.PUCK, BallType.parse(1));
        assertEquals(BallType.SNOWBALL, BallType.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        BallType.parse(10);
    }

}
