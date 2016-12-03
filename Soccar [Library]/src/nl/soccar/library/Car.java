package nl.soccar.library;

import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.HandbrakeAction;
import nl.soccar.library.enumeration.SteerAction;
import nl.soccar.library.enumeration.ThrottleAction;

/**
 * A Car is an Entity, placed on a Map, that moves around based on a Player's
 * input.
 *
 * @author PTS34A
 */
public class Car extends Entity {

    /**
     * Car constant in JBox2D units.
     */
    public static final float CAR_WIDTH = 3.0F;

    private final float width;
    private final float height;

    private final float wheelWidth;
    private final float wheelHeight;

    private SteerAction steerAction;
    private ThrottleAction throttleAction;
    private HandbrakeAction handbrakeAction;

    private int booster;
    private CarType type;
    private final Player player;

    /**
     * Constructor used to instantiate a new Car object. Booster will be set to
     * 0 by default. By providing the general size of the car, it will
     * automatically calculate the size of the wheels.
     *
     * @param x The X-position of this Car, relative to the Map this Car is
     * placed on.
     * @param y The Y-position of this Car, relative to the Map this Car is
     * placed on.
     * @param degree The angle, in degrees, in which this Car is going in,
     * relative to the Map this Car is placed on.
     * @param type The CarType of this Car. The type determines how this Car
     * will be drawn on the screen.
     * @param player The Player that is driving this Car. The player should not
     * be null.
     */
    public Car(float x, float y, float degree, CarType type, Player player) {
        super(x, y, degree);

        this.width = CAR_WIDTH;
        this.height = width * 2.35F;

        wheelWidth = width / 5.0F;
        wheelHeight = wheelWidth * 2.0F;

        this.type = type;
        this.player = player;

        booster = 0;

        steerAction = SteerAction.NONE;
        throttleAction = ThrottleAction.IDLE;
        handbrakeAction = HandbrakeAction.INACTIVE;
    }

    /**
     * Gets the width of this Car in JBox2D units.
     *
     * @return The width of this Car.
     */
    public float getWidth() {
        return width;
    }

    /**
     * Gets the height of this Car in JBox2D units.
     *
     * @return The height of this Car.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Gets the width of the wheels of this Car in JBox2D units.
     *
     * @return The width of the wheels of this Car.
     */
    public float getWheelWidth() {
        return wheelWidth;
    }

    /**
     * Gets the height of the wheels of this Car in JBox2D units.
     *
     * @return The height of the wheels of this Car.
     */
    public float getWheelHeight() {
        return wheelHeight;
    }

    /**
     * Gets the remaining booster of this Car.
     *
     * @return The remaining booster of this Car, between 0 and 100 inclusive.
     */
    public int getBooster() {
        return booster;
    }

    /**
     * Gets the CarType of this Car.
     *
     * @return The CarType of this Car.
     */
    public CarType getCarType() {
        return type;
    }

    /**
     * Gets the Player that is driving this Car.
     *
     * @return The Player that is driving this Car, not null.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the current SteerAction of this Car. This way the engine can
     * determine what actions a Car should perform.
     *
     * @param steerAction The new SteerAction of this Car.
     */
    public void setSteerAction(SteerAction steerAction) {
        this.steerAction = steerAction;
    }

    /**
     * Gets the current SteerAction of this Car.
     *
     * @return The SteerAction of this Car.
     */
    public SteerAction getSteerAction() {
        return steerAction;
    }

    /**
     * Sets the current ThrottleAction of this Car. This way the engine can
     * determine what actions a Car should perform.
     *
     * @param throttleAction The new ThrottleAction of this Car.
     */
    public void setThrottleAction(ThrottleAction throttleAction) {
        this.throttleAction = throttleAction;
    }

    /**
     * Gets the current ThrottleAction of this Car.
     *
     * @return The ThrottleAction of this Car.
     */
    public ThrottleAction getThrottleAction() {
        return throttleAction;
    }

    /**
     * Sets the current HandbrakeAction of this Car. This way the engine can
     * determine what actions a Car should perform.
     *
     * @param handbrakeAction The new HandbrakeAction of this Car.
     */
    public void setHandbrakeAction(HandbrakeAction handbrakeAction) {
        this.handbrakeAction = handbrakeAction;
    }

    /**
     * Gets the current HandbrakeAction of this Car.
     *
     * @return The HandbrakeAction of this Car.
     */
    public HandbrakeAction getHandbrakeAction() {
        return handbrakeAction;
    }
}
