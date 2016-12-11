package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.TeamColour;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the TeamColour enumeration.
 *
 * @author PTS34A
 */
public class TeamColourTest {

    // Declaration of test object.
    private TeamColour teamColour;

    @Before
    public void setUp() {
        teamColour = TeamColour.BLUE;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, teamColour.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(TeamColour.BLUE, TeamColour.parse(0));
        assertEquals(TeamColour.RED, TeamColour.parse(1));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        TeamColour.parse(10);
    }

}
