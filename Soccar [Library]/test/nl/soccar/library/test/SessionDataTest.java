package nl.soccar.library.test;

import nl.soccar.library.SessionData;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.SessionData class.
 *
 * @author PTS34A
 */
public class SessionDataTest {

    // Declaration of test object.
    private SessionData sessionData;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        sessionData = new SessionData("address", "roomName", "hostName", true);
    }

    /**
     * Tests the getAddress method.
     */
    @Test
    public void getAddressTest() {
        assertEquals("address", sessionData.getAddress());
    }

    /**
     * Tests the getRoomName method.
     */
    @Test
    public void getRoomNameTest() {
        assertEquals("roomName", sessionData.getRoomName());
    }

    /**
     * Tests the getHostName method.
     */
    @Test
    public void getHostNameAndSetHostNameTest() {
        sessionData.setHostName("newHostName");
        assertEquals("newHostName", sessionData.getHostName());
    }

    /**
     * Tests the hasPassword method.
     */
    @Test
    public void hasPasswordTest() {
        assertEquals(true, sessionData.hasPassword());
    }

    /**
     * Tests the getOccupation and setOccupation methods.
     */
    @Test
    public void getOccupationAndSetOccupationTest() {
        sessionData.setOccupation(5);
        assertEquals(5, sessionData.getOccupation());
    }

    /**
     * Tests the getCapacityAndSetCapacity methods.
     */
    @Test
    public void getCapacityAndSetCapacityTest() {
        sessionData.setCapacity(6);
        assertEquals(6, sessionData.getCapacity());
    }

}
