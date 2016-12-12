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
    }

    /**
     * Tests the getLastGoalEvent method.
     */
    @Test
    public void getLastGoalEvent() {
        game.addEvent(eventGoalRed);
        assertEquals(eventGoalRed, game.getLastGoalEvent());
        game.addEvent(eventGoalBlue);
        assertEquals(eventGoalBlue, game.getLastGoalEvent());
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

    /**
     * Tests the getSecondsLeft and getTimeLeftString methods.
     */
    @Test
    public void getSecondsLeftTest() {
        game.start();
        game.getGameSettings().setDuration(Duration.MINUTES_3);
        assertEquals(3 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 3, 0), game.getTimeLeftString());
        game.stop();

        game.start();
        game.getGameSettings().setDuration(Duration.MINUTES_5);
        assertEquals(5 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 5, 0), game.getTimeLeftString());
        game.stop();

        game.start();
        game.getGameSettings().setDuration(Duration.MINUTES_10);
        assertEquals(10 * 60, game.getSecondsLeft());
        assertEquals(String.format("%d:%02d", 10, 0), game.getTimeLeftString());
        game.stop();
    }

    /**
     * Tests the getNotification and setNotification methods.
     */
    @Test
    public void getNotificationAndSetNotificationTest() {
        game.setNotification(notification);
        assertEquals(notification, game.getNotification());
    }

}
