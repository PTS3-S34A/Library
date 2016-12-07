package nl.soccar.library;

/**
 * Class that represents the Notification model.
 *
 * @author Robin Laugs
 */
public class ScoreBoard extends Entity {

    private int scoreBlue;
    private int scoreRed;
    private int secondsLeft;

    /**
     * Initiates a new Notification using the given parameters.
     *
     * @param x      The x-coordinate, relative to the map, of this Notification.
     * @param y      The y-coordinate, relative to the map, of this Notification.
     * @param degree The angle of this Notification.
     */

    public ScoreBoard(float x, float y, float degree) {
        super(x, y, degree);

        scoreBlue = 0;
        scoreRed = 0;
    }

    public int getScoreBlue() {
        return scoreBlue;
    }

    public void setScoreBlue(int scoreBlue) {
        this.scoreBlue = scoreBlue;
    }

    public int getScoreRed() {
        return scoreRed;
    }

    public void setScoreRed(int scoreRed) {
        this.scoreRed = scoreRed;
    }

    public String getContent() {
        return String.format("%d - %s - %d", this.scoreBlue, this.secondsLeft, this.scoreRed);
    }

    public int getSecondsLeft() {
        return secondsLeft;
    }

    public void setSecondsLeft(int secondsLeft) {
        this.secondsLeft = secondsLeft;
    }

    public String getTimeString() {

        if (secondsLeft <= 0) {
            return "0:00";
        }

        long minutes = secondsLeft / 60;
        long seconds = secondsLeft % 60;

        return String.format("%d:%02d", minutes, seconds);
    }
}
