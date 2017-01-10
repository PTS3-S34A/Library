package nl.soccar.library.test;

import java.util.ArrayList;
import java.util.List;
import nl.soccar.library.Player;
import nl.soccar.library.Room;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.Privilege;
import nl.soccar.library.enumeration.TeamColour;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Room class.
 *
 * @author PTS34A
 */
public class RoomTest {

    // Declaration of test objects.
    private Room room;
    private Player player;

    @Before
    public void setUp() {
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
        room = new Room("name", "password");
        room.getTeamBlue().join(player);
    }

    /**
     * Tests the check method.
     */
    @Test
    public void checkTest() {
        assertTrue(room.check("password"));
        assertFalse(room.check("wrong password"));
    }

    /**
     * Tests get getHost method.
     */
    @Test
    public void getHostAndSetHostTest() {
        room.setHost(player);
        assertEquals(player, room.getHost());
    }

    /**
     * Tests the getTeamRed method.
     */
    @Test
    public void getTeamRedTest() {
        assertEquals(TeamColour.RED, room.getTeamRed().getTeamColour());
    }

    /**
     * Tests the getTeamBlue method.
     */
    @Test
    public void getTeamBlueTest() {
        assertEquals(TeamColour.BLUE, room.getTeamBlue().getTeamColour());
    }

    /**
     * Tests the getAllPlayers method.
     */
    @Test
    public void getAllPlayersTest() {
        List<Player> players = new ArrayList<>();
        players.addAll(room.getTeamRed().getPlayers());
        players.addAll(room.getTeamBlue().getPlayers());
        assertEquals(players, room.getAllPlayers());
    }

    /**
     * Tests the getName method.
     */
    @Test
    public void getNameTest() {
        assertEquals("name", room.getName());
    }

    /**
     * Test the getOccupancy method.
     */
    @Test
    public void getOccupancyTest() {
        assertEquals(1, room.getOccupancy());
    }

    /**
     * Tests the getCapacity and setCapacity methods.
     */
    @Test
    public void getCapacityAndSetCapacityTest() {
        room.setCapacity(4);
        assertEquals(4, room.getCapacity());
    }

    /**
     * Tests the passwordAvailable method.
     */
    @Test
    public void passwordAvailableTest() {
        assertTrue(room.passwordAvailable());
        room = new Room("name", "");
        assertFalse(room.passwordAvailable());
    }

}
