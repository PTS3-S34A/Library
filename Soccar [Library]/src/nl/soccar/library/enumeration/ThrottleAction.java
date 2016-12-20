package nl.soccar.library.enumeration;

/**
 * Enumeration for the available throttle actions.
 *
 * @author PTS34A
 */
public enum ThrottleAction {

    IDLE(0),
    ACCELERATE(1),
    REVERSE(2),
    BOOST(3);

    private final int id;

    private ThrottleAction(int id) {
        this.id = id;
    }

    /**
     * Gets the id of the ThrottleAction enumeration value.
     *
     * @return The id of the ThrottleAction enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the ThrottleAction enumeration value based on the given id.
     *
     * @param id The id of the ThrottleAction that needs to be retrieved.
     * @return The ThrottleAction enumeration value based on the given id.
     */
    public static ThrottleAction parse(int id) {
        switch (id) {
            case 0:
                return IDLE;
            case 1:
                return ACCELERATE;
            case 2:
                return REVERSE;
            case 3:
                return BOOST;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
