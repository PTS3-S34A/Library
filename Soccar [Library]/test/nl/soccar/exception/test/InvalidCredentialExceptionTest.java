package nl.soccar.exception.test;

import nl.soccar.exception.InvalidCredentialException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test that tests the nl.soccar.exception.InvalidCredentialExceptionTest
 class.
 *
 * @author PTS34A
 */
public class InvalidCredentialExceptionTest {

    // Declaration of test object.
    private InvalidCredentialException exception;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        exception = new InvalidCredentialException("title", "message");
    }

    /**
     * Tests the getTitle method.
     */
    @Test
    public void getTitleTest() {
        assertEquals("title", exception.getTitle());
    }

}
