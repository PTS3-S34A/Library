package nl.soccar.library;

import javafx.scene.shape.Rectangle;
import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.EventType;
import nl.soccar.library.enumeration.GameStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * A Game is an object which contains information about a match, like the
 * duration, the GameStatus and the BallType. It also containts a collection of
 * Events that are triggered in the match.
 *
 * @author PTS34A
 */
public class Game {

    private final GameSettings settings = new GameSettings();
    private final List<Event> events = new ArrayList<>();

    private final Map map;
    private Notification notification;
    private GameStatus status;

    private int timeLeft;

    /**
     * Constructor used to instantiate a new Game object. While initializing
     * this Game, a new Ball is created and the Map is set with the default
     * constant values. The startTime is set to empty, the GameStatus is set to
     * stopped and the events list is initiated.
     */
    public Game() {
        Ball ball = new Ball(MapConstants.MAP_WIDTH / 2, MapConstants.MAP_HEIGHT / 2, 0, BallType.FOOTBALL);
        Rectangle size = new Rectangle(0, 0, MapConstants.MAP_WIDTH, MapConstants.MAP_HEIGHT);

        double goalPositionY = (MapConstants.MAP_HEIGHT / 2) + (MapConstants.GOAL_HEIGHT / 2);
        Rectangle leftGoal = new Rectangle(MapConstants.FIELD_MARGIN - MapConstants.GOAL_WIDTH, goalPositionY, MapConstants.GOAL_WIDTH, MapConstants.GOAL_HEIGHT);
        Rectangle rightGoal = new Rectangle(MapConstants.MAP_WIDTH - MapConstants.FIELD_MARGIN, goalPositionY, MapConstants.GOAL_WIDTH, MapConstants.GOAL_HEIGHT);

        map = new Map(size, ball, leftGoal, rightGoal);
        status = GameStatus.STOPPED;
    }

    /**
     * Starts this Game and sets the correct settings (set in GameSettings) in
     * this Game, the Map, and the Ball. The correct end-time and start-time
     * will be set. If this Game is already running, no action will be
     * performed.
     */
    public void start() {
        if (status != GameStatus.STOPPED) {
            return;
        }

        events.clear();

        map.setMapType(settings.getMapType());
        map.getBall().setBallType(settings.getBallType());

        timeLeft = getDurationInSeconds();
        status = GameStatus.PAUSED;
    }

    /**
     * Ends this Game and sets the correct end-time. If this game is already
     * stopped, no action will be performed.
     */
    public void stop() {
        if (status == GameStatus.STOPPED) {
            return;
        }

        timeLeft = 0;
        status = GameStatus.STOPPED;
    }

    /**
     * Decreased the game time left by one. If the value is 0 or lower, it will stop the game.
     */
    public void decreaseGameTime() {
        if (status == GameStatus.RUNNING && --timeLeft <= 0) {
            stop();
        }
    }

    /**
     * Sets the game time left. If the value is 0 or lower, it will stop the game.
     *
     * @param timeLeft The new time left for this game.
     */
    public void setGameTime(int timeLeft) {
        if (status == GameStatus.RUNNING) {
            this.timeLeft = timeLeft;

            if (timeLeft <= 0) {
                stop();
            }
        }
    }

    /**
     * Sets this game's Status to paused, given that its current Status is not STOPPED.
     *
     * @param paused
     */
    public void setPaused(boolean paused) {
        if (status == GameStatus.STOPPED) {
            return;
        }

        status = paused ? GameStatus.PAUSED : GameStatus.RUNNING;
    }

    /**
     * If a goal has been scored, this Game's status will be set to scored. If,
     * however, this Game is not running, no action will be performed.
     *
     * @param scored Whether there has been scored or not.
     */
    public void setGoalScored(boolean scored) {
        if (status == GameStatus.STOPPED) {
            return;
        }

        status = scored ? GameStatus.SCORED : GameStatus.RUNNING;
    }

    /**
     * Gets the settings of this Game on which certain properties can be
     * set/get.
     *
     * @return The settings of this Game.
     */
    public GameSettings getGameSettings() {
        return settings;
    }

    /**
     * Gets all Events that occurred in this Game.
     *
     * @return A collection of Events that occurred in this Game, not null.
     */
    public List<Event> getEvents() {
        return Collections.unmodifiableList(events);
    }

    /**
     * Adds an Event to this Game.
     *
     * @param event The Event that was triggered during this Game.
     */
    public void addEvent(Event event) {
        events.add(0, event);
    }

    /**
     * Returns the List size for a given EventType.
     *
     * @param type
     * @return int The size of the List
     */
    public int getEventCountByType(EventType type) {
        return (int) events.stream().filter(e -> e.getType() == type).count();
    }

    public Event getLastGoalEvent() {
        Optional<Event> optional = events.stream().filter(e -> e.getType() == EventType.GOAL_BLUE || e.getType() == EventType.GOAL_RED).findFirst();
        if (!optional.isPresent()) {
            return null;
        }

        return optional.get();
    }

    /**
     * Gets the Map that belongs to this Game.
     *
     * @return This Game's Map.
     */
    public Map getMap() {
        return map;
    }

    /**
     * Gets the GameStatus of this Game.
     *
     * @return The GameStatus of this Game, not null.
     */
    public GameStatus getStatus() {
        return status;
    }

    /**
     * Gets the seconds remaining for the current game.
     *
     * @return
     */
    public int getSecondsLeft() {
        return timeLeft;
    }

    /**
     * Returns the game duration in seconds.
     *
     * @return int Duration in seconds.
     */
    private int getDurationInSeconds() {
        switch (settings.getDuration()) {
            case MINUTES_3:
                return 180;
            case MINUTES_5:
                return 300;
            default:
            case MINUTES_10:
                return 600;
        }
    }

    public String getTimeLeftString() {
        int duration = getSecondsLeft();
        int minutes = duration / 60;
        int seconds = duration % 60;

        return String.format("%d:%02d", minutes, seconds);
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
