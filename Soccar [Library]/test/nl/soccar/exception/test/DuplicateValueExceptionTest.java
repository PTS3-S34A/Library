package nl.soccar.exception.test;

import nl.soccar.exception.DuplicateValueException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 * JUnit test that tests the nl.soccar.exception.DuplicateValueException class.
 *
 * @author PTS34A
 */
public class DuplicateValueExceptionTest {

    // Declaration of test object.
    private DuplicateValueException exception;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        exception = new DuplicateValueException("title", "message");
    }

    /**
     * Tests the getTitle method.
     */
    @Test
    public void getTitleTest() {
        assertEquals("title", exception.getTitle());
    }

}
