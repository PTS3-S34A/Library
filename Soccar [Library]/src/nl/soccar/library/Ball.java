package nl.soccar.library;

import nl.soccar.library.enumeration.BallType;

/**
 * A Ball is an Entity, placed on a Map, that autonomously moves around.
 *
 * @author PTS34A
 */
public class Ball extends Entity {

    /**
     * Ball constant in JBox2D units.
     */
    public static final float BALL_RADIUS = 2.5F;

    private final float radius;

    private Player lastTouched;
    private BallType type;

    /**
     * Constructor used to instantiate a new Ball object.
     *
     * @param x The X-position of this Ball, relative to the Map this Ball is
     * placed on.
     * @param y The Y-position of this Ball, relative to the Map this Ball is
     * placed on.
     * @param degree The angle, in degrees, in which this Ball is going in,
     * relative to the Map this Ball is placed on.
     * @param type The BallType of this Ball. The BallType determines how this
     * Ball will be drawn on the screen.
     */
    public Ball(float x, float y, float degree, BallType type) {
        super(x, y, degree);
        this.radius = BALL_RADIUS;
        this.type = type;
    }

    /**
     * Gets the Player who last touched this Ball.
     *
     * @return The Player who last touched this Ball.
     */
    public Player getLastTouched() {
        return lastTouched;
    }

    /**
     * Sets the Player who last touched this Ball.
     *
     * @param lastTouched The Player who last touched this Ball.
     */
    public void setLastTouched(Player lastTouched) {
        this.lastTouched = lastTouched;
    }

    /**
     * Gets the radius of this Ball.
     *
     * @return The radius of this ball.
     */
    public float getRadius() {
        return radius;
    }

    /**
     * Gets the BallType of this Ball.
     *
     * @return The BallType of this Ball, not null.
     */
    public BallType getBallType() {
        return type;
    }

    /**
     * Sets the BallType of this Ball.
     *
     * @param type The BallType that needs to be set for this Ball.
     */
    void setBallType(BallType type) {
        this.type = type;
    }

}
