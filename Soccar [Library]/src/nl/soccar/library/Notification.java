package nl.soccar.library;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Class that represents the Notification model.
 * 
 * @author Robin Laugs
 */
public class Notification extends Entity {

    private Player player;
    private LocalTime displayTime;
    private final int displayDuration;

    /**
     * Initiates a new Notification using the given parameters.
     * @param x The x-coordinate, relative to the map, of this Notification.
     * @param y The y-coordinate, relative to the map, of this Notification.
     * @param degree The angle of this Notification.
     * @param displayDuration The duration the notification should be displayed.
     */
    public Notification(float x, float y, float degree, int displayDuration) {
        super(x, y, degree);
        this.displayDuration = displayDuration;
        this.displayTime = LocalTime.MIN;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setDisplayTime(LocalTime displayTime) {
        this.displayTime = displayTime;
    }

    public String getContent() {
        return String.format("%s %s", player.getUsername(), "SCORED!");
    }

    public boolean isActive() {
        return ChronoUnit.SECONDS.between(displayTime, LocalTime.now()) <= displayDuration;
    }
}
