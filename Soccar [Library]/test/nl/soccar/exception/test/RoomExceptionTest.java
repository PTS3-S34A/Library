package nl.soccar.exception.test;

import nl.soccar.exception.RoomException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test that tests the nl.soccar.exception.RoomException class.
 *
 * @author PTS34A
 */
public class RoomExceptionTest {

    // Declaration of test object.
    private RoomException exception;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        exception = new RoomException("title", "message");
    }

    /**
     * Tests the getTitle method.
     */
    @Test
    public void getTitleTest() {
        assertEquals("title", exception.getTitle());
    }

}
