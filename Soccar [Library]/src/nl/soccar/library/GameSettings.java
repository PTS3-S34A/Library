package nl.soccar.library;

import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.Duration;
import nl.soccar.library.enumeration.MapType;

/**
 * GameSettings takes care of all the different properties that should/could be
 * set before a Game starts.
 *
 * @author PTS34A
 */
public final class GameSettings {

    private MapType mapType;
    private BallType ballType;
    private Duration duration;

    /**
     * Instanties a new GameSettings instance with default values.
     */
    public GameSettings() {
        mapType = MapType.GRASSLAND;
        ballType = BallType.FOOTBALL;
        duration = Duration.MINUTES_5;
    }

    /**
     * Gets the desired MapType in the settings, will be used to set the correct
     * MapType in the real Map.
     *
     * @return The current set MapType.
     */
    public MapType getMapType() {
        return mapType;
    }

    /**
     * Sets the desired MapType in the settings.
     *
     * @param mapType The new MapType to set.
     */
    public void setMapType(MapType mapType) {
        this.mapType = mapType;
    }

    /**
     * Gets the desired BallType in the settings, will be used to set the
     * correct BallType in the real Ball.
     *
     * @return The current set BallType.
     */
    public BallType getBallType() {
        return ballType;
    }

    /**
     * Sets the desired BallType in the settings.
     *
     * @param ballType The new BallType to set.
     */
    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    /**
     * Gets the desired Duration in the settings, will be used to set the
     * correct Duration in the real Game.
     *
     * @return The current set Duration.
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the desired Duration in the settings.
     *
     * @param duration The new Duration to set.
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

}
