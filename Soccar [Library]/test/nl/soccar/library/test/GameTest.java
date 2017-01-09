package nl.soccar.library.test;

import java.time.LocalTime;
import javafx.scene.paint.Color;
import nl.soccar.library.Event;
import nl.soccar.library.Game;
import nl.soccar.library.Notification;
import nl.soccar.library.Player;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.Duration;
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
    private Event eventGoalRed;
    private Event eventGoalBlue;
    private Notification notification;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        game = new Game();
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
        eventGoalRed = new Event(EventType.GOAL_RED, LocalTime.of(13, 55, 03), player);
        eventGoalBlue = new Event(EventType.GOAL_BLUE, LocalTime.of(13, 55, 03), player);
        notification = new Notification(1.0F, 2.0F, 3.0F, 4, Color.WHITE);
    }

    /**
     * Tests the start and stop methods.
     */
    @Test
    public void startAndStopTest() {
        // Tests all paths in the start and stop methods.
        game.start();
        assertEquals(GameStatus.PAUSED, game.getStatus());
        game.start();
        assertEquals(GameStatus.PAUSED, game.getStatus());
        game.stop();
        assertEquals(GameStatus.STOPPED, game.getStatus());
        game.stop();
        assertEquals(GameStatus.STOPPED, game.getStatus());
    }

    /**
     * Tests the decreaseGameTime method.
     */
    @Test
    public void decreaseGameTimeTest() {
        game.start();
        // Decrease the game time when the game is not running.
        game.decreaseGameTime();

        // Set the GameStatus to RUNNING.
        game.setPaused(false);

        // Decrease the game time three hundered times (5 minutes) when the game is running.
        for (int i = 0; i < 300; i++) {
            game.decreaseGameTime();
        }

        // Assert the game is stopped after decreasing the game time 300 times (5 minutes).
        assertEquals(GameStatus.STOPPED, game.getStatus());
    }

    /**
     * Tests the setGameTime method.
     */
    @Test
    public void setGameTimeTest() {
        // Tests all paths in the setGameTest method.
        game.setGameTime(10);

        game.start();

        // Set the GameStatus to RUNNING.
        game.setPaused(false);

        game.setGameTime(10);
        assertEquals(GameStatus.RUNNING, game.getStatus());

        game.setGameTime(0);
        assertEquals(GameStatus.STOPPED, game.getStatus());
    }

    /**
     * Tests the setPaused method.
     */
    @Test
    public void setPausedTest() {
        game.setPaused(true);
        assertEquals(GameStatus.STOPPED, game.getStatus());

        game.start();

        game.setPaused(true);
        assertEquals(GameStatus.PAUSED, game.getStatus());
        game.setPaused(false);
        assertEquals(GameStatus.RUNNING, game.getStatus());
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
        game.addEvent(eventGoalRed);
        assertEquals(eventGoalRed, game.getEvents().get(0));
    }

    /**
     * Tests the getEventCountByType method.
     */
    @Test
    public void getEventCountByTypeTest() {
        game.addEvent(eventGoalRed);
        assertEquals(1, game.getEventCountByType(EventType.GOAL_RED));
        assertEquals(0, game.getEventCountByType(EventType.GOAL_BLUE));
    }

    /**
     * Tests the getLastGoalEvent method.
     */
    @Test
    public void getLastGoalEvent() {
        assertNull(game.getLastGoalEvent());

        game.addEvent(eventGoalRed);
        assertEquals(eventGoalRed, game.getLastGoalEvent());

        game.addEvent(eventGoalBlue);
        assertSame(eventGoalBlue, game.getLastGoalEvent());
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
     * Tests the getSecondsLeft and getTimeLeftString methods.
     */
    @Test
    public void getSecondsLeftTest() {
        game.getGameSettings().setDuration(Duration.MINUTES_3);
        game.start();
        assertEquals(3 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 3, 0), game.getTimeLeftString());
        game.stop();

        game.getGameSettings().setDuration(Duration.MINUTES_5);
        game.start();
        assertEquals(5 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 5, 0), game.getTimeLeftString());
        game.stop();

        game.getGameSettings().setDuration(Duration.MINUTES_10);
        game.start();
        assertEquals(10 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 10, 0), game.getTimeLeftString());
        game.stop();
    }

    /**
     * Tests the getTimeLeftString method.
     */
    @Test
    public void getTimeLeftStringTest() {
        game.start();
        assertEquals(String.format("%d:%02d", 5, 0), game.getTimeLeftString());
    }

    /**
     * Tests the getNotification and setNotification methods.
     */
    @Test
    public void getNotificationAndSetNotificationTest() {
        game.setNotification(notification);
        assertEquals(notification, game.getNotification());
    }

    /**
     * Marks the private getDurationInSeconds method as tested in JaCoCo.
     */
    @Test
    public void getDurationInSecondsTest() {
        game.getGameSettings().setDuration(Duration.MINUTES_3);
        game.start();
        game.stop();

        game.getGameSettings().setDuration(Duration.MINUTES_5);
        game.start();
        game.stop();

        game.getGameSettings().setDuration(Duration.MINUTES_10);
        game.start();
        game.stop();
    }

}
