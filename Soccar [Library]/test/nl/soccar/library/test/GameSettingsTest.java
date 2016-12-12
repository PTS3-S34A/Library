package nl.soccar.library.test;

import nl.soccar.library.GameSettings;
import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.Duration;
import nl.soccar.library.enumeration.MapType;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test that tests the nl.soccar.library.GameSettings class.
 *
 * @author PTS34A
 */
public class GameSettingsTest {

    // Declaration of test object.
    private GameSettings gameSettings;

    /**
     * Instantiation of test object.
     */
    @Before
    public void setUp() {
        gameSettings = new GameSettings();
    }

    /**
     * Tests the getMapTypeAndSetMapType methods.
     */
    @Test
    public void getMapTypeAndSetMapTypeTest() {
        gameSettings.setMapType(MapType.ICE);
        assertEquals(MapType.ICE, gameSettings.getMapType());
    }

    /**
     * Tests the getBallTypeAndSetBallType methods.
     */
    @Test
    public void getBallTypeAndSetBallTypeTest() {
        gameSettings.setBallType(BallType.SNOWBALL);
        assertEquals(BallType.SNOWBALL, gameSettings.getBallType());
    }

    /**
     * Tests the getDurationAndSetDuration methods.
     */
    @Test
    public void getDurationAndSetDurationTest() {
        gameSettings.setDuration(Duration.MINUTES_10);
        assertEquals(Duration.MINUTES_10, gameSettings.getDuration());
    }

}
