package nl.soccar.library.test;

import nl.soccar.library.Player;
import nl.soccar.library.Session;
import nl.soccar.library.Statistics;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.Privilege;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Player class.
 *
 * @author PTS34A
 */
public class PlayerTest {

    // Declaration of test objects.
    private Player player;
    private Statistics statistics;
    private Session session;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
        statistics = new Statistics("username", 0, 0, 0, 0, 0);
        session = new Session("name", "password");
    }

    /**
     * Tests the getUsername method.
     */
    @Test
    public void getUsernameTest() {
        assertEquals("username", player.getUsername());
    }

    /**
     * Tests the getPrivilege method.
     */
    @Test
    public void getPrivilegeTest() {
        assertEquals(Privilege.NORMAL, player.getPrivilege());
    }

    /**
     * Tests the getCarType method.
     */
    @Test
    public void getCarTypeTest() {
        assertEquals(CarType.CASUAL, player.getCarType());
    }

    /**
     * Tests the getStatistics and setStatistics methods.
     */
    @Test
    public void getStatisticsAndSetStatisticsTest() {
        player.setStatistics(statistics);
        assertEquals(statistics, player.getStatistics());
    }

    /**
     * Tests the getCurrentSession and setCurrentSession methods.
     */
    @Test
    public void getCurrentSessionAndSetCurrentSessionTest() {
        player.setCurrentSession(session);
        assertEquals(session, player.getCurrentSession());
    }

    /**
     * Tests the getPlayedId method.
     */
    @Test
    public void getPlayedIdAndSetPlayerIdTest() {
        player.setPlayerId(1);
        assertEquals(1, player.getPlayerId());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void hashCodeTest() {
        assertEquals(17 * 31 + player.getUsername().hashCode(), player.hashCode());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void equalsTest() {
        assertTrue(player.equals(player));
        assertFalse(player.equals(null));
        assertFalse(player.equals(new Object()));
    }

    /**
     * Tests the toString method
     */
    @Test
    public void toStringTest() {
        assertEquals("username", player.toString());
    }
    
}
