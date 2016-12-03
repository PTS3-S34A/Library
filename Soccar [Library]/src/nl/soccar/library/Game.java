package nl.soccar.library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.scene.shape.Rectangle;
import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.GameStatus;

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
    private GameStatus status;

    private LocalTime startTime;
    private LocalTime endTime;

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

        map.setMapType(settings.getMapType());
        map.getBall().setBallType(settings.getBallType());

        status = GameStatus.RUNNING;

        startTime = LocalTime.now();
        endTime = null;
    }

    /**
     * Ends this Game and sets the correct end-time. If this game is already
     * stopped, no action will be performed.
     */
    public void stop() {
        if (status == GameStatus.STOPPED) {
            return;
        }

        status = GameStatus.STOPPED;

        endTime = LocalTime.now();
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
        events.add(event);
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
     * Gets the time at which this Game started.
     *
     * @return The start-time of this Game. If this game has never been started,
     * this method will return null.
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Gets the time at which this Game ended.
     *
     * @return The end-time of this Game. If this game has not been ended yet,
     * this method returns null.
     */
    public LocalTime getEndTime() {
        return endTime;
    }

}
