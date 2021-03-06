package nl.soccar.library.enumeration;

/**
 * Enumeration of all available steer actions.
 *
 * @author PTS34A
 */
public enum SteerAction {

    NONE(0),
    STEER_LEFT(1),
    STEER_RIGHT(2);

    private final int id;

    SteerAction(int id) {
        this.id = id;
    }

    /**
     * Gets the SteerAction enumeration value based on the given id.
     *
     * @param id The id of the SteerAction that needs to be retrieved.
     * @return The SteerAction enumeration value based on the given id.
     */
    public static SteerAction parse(int id) {
        if (id == NONE.id) {
            return NONE;
        }

        if (id == STEER_LEFT.id) {
            return STEER_LEFT;
        }

        if (id == STEER_RIGHT.id) {
            return STEER_RIGHT;
        }
        throw new IllegalArgumentException("Invalid id.");
    }

    /**
     * Gets the id of the SteerAction enumeration value.
     *
     * @return The id of the SteerAction enumeration value.
     */
    public int getId() {
        return id;
    }

}
