package nl.soccar.library.enumeration;

/**
 * Enumeration of all available steer actions.
 *
 * @author PTS34A
 */
public enum HandbrakeAction {

    ACTIVE(0),
    INACTIVE(1);

    private final int id;

    private HandbrakeAction(int id) {
        this.id = id;
    }

    /**
     * Gets the id of the HandbrakeAction enumeration value.
     *
     * @return The id of the HandbrakeAction enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the HandbrakeAction enumeration value based on the given id.
     *
     * @param id The id of the HandbrakeAction that needs to be retrieved.
     * @return The HandbrakeAction enumeration value based on the given id.
     */
    public static HandbrakeAction parse(int id) {
        switch (id) {
            case 0:
                return ACTIVE;
            case 1:
                return INACTIVE;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
