package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.Privilege;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Privilege enumeration.
 *
 * @author PTS34A
 */
public class PrivilegeTest {

    // Declaration of test object.
    private Privilege privilege;

    @Before
    public void setUp() {
        privilege = Privilege.GUEST;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, privilege.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(Privilege.GUEST, Privilege.parse(0));
        assertEquals(Privilege.NORMAL, Privilege.parse(1));
        assertEquals(Privilege.ADMINISTRATOR, Privilege.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        Privilege.parse(10);
    }

}
