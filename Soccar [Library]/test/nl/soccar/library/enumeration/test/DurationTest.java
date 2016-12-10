package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.Duration;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Duration enumeration.
 *
 * @author PTS34A
 */
public class DurationTest {

    // Declaration of test object.
    private Duration duration;

    @Before
    public void setUp() {
        duration = Duration.MINUTES_3;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, duration.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(Duration.MINUTES_3, Duration.parse(0));
        assertEquals(Duration.MINUTES_5, Duration.parse(1));
        assertEquals(Duration.MINUTES_10, Duration.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        Duration.parse(10);
    }

}
