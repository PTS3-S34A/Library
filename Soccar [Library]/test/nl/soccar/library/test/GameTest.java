package nl.soccar.library.test;

import java.time.LocalTime;
import nl.soccar.library.Event;
import nl.soccar.library.Game;
import nl.soccar.library.Player;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.EventType;
import nl.soccar.library.enumeration.GameStatus;
import nl.soccar.library.enumeration.Privilege;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Game class.
 *
 * @author PTS34A
 */
public class GameTest {

    // Declaration of test objects.
    private Game game;
    private Player player;
    private Event event;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        game = new Game();
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
        event = new Event(EventType.GOAL_RED, LocalTime.of(13, 55, 03), player);
    }

    /**
     * Tests the start method.
     */
    @Test
    public void startTest() {
        game.start();
        assertEquals(GameStatus.RUNNING, game.getStatus());
        game.stop();
        assertEquals(GameStatus.STOPPED, game.getStatus());
        game.start();
        assertEquals(GameStatus.RUNNING, game.getStatus());
        game.start();
    }

    /**
     * Tests the stop method.
     */
    @Test
    public void stopTest() {
        game.stop();
        assertEquals(GameStatus.STOPPED, game.getStatus());
        game.start();
        assertEquals(GameStatus.RUNNING, game.getStatus());
        game.stop();
        assertEquals(GameStatus.STOPPED, game.getStatus());
    }

    /**
     * Tests the setGoalScored method.
     */
    @Test
    public void setGoalScoredTest() {
        game.setGoalScored(true);
        assertEquals(GameStatus.STOPPED, game.getStatus());
        game.start();
        game.setGoalScored(true);
        assertEquals(GameStatus.SCORED, game.getStatus());
        game.setGoalScored(false);
        assertEquals(GameStatus.RUNNING, game.getStatus());
    }

    /**
     * Tests the getGameSettings method.
     */
    @Test
    public void getGameSettingsTest() {
        assertNotNull(game.getGameSettings());
    }

    /**
     * Tests the addEvent and getEvents methods.
     */
    @Test
    public void addEventAndGetEventsTest() {
        game.addEvent(event);
        assertEquals(event, game.getEvents().get(0));
    }

    /**
     * Tests the getMap method.
     */
    @Test
    public void getMapTest() {
        assertNotNull(game.getMap());
    }

    /**
     * Tests the getStatus methods.
     */
    @Test
    public void getStatusTest() {
        assertEquals(GameStatus.STOPPED, game.getStatus());
    }

    /**
     * Tests the getStarttime method.
     */
    @Test
    public void getStartTimeTest() {
        assertNull(game.getStartTime());
    }

    /**
     * Tests the getEndTime method.
     */
    @Test
    public void getEndtimeTest() {
        assertNull(game.getEndTime());
    }

}
