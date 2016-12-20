package nl.soccar.exception.test;

import nl.soccar.exception.RogueGameServerException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test that tests the nl.soccar.exception.RogueGameServerException class.
 *
 * @author PTS34A
 */
public class RogueGameServerExceptionTest {

    // Declaration of test object.
    private RogueGameServerException exception;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        exception = new RogueGameServerException("title", "message");
    }

    /**
     * Tests the getTitle method.
     */
    @Test
    public void getTitleTest() {
        assertEquals("title", exception.getTitle());
    }

}
