package nl.soccar.library.enumeration;

/**
 * Enumeration of all available match durations in the game.
 *
 * @author PTS34
 */
public enum Duration {

    MINUTES_3(0),
    MINUTES_5(1),
    MINUTES_10(2);

    private final int id;

    private Duration(int id) {
        this.id = id;
    }

    /**
     * Gets the id of the Duration enumeration value.
     *
     * @return The id of the Duration enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the Duration enumeration value based on the given id.
     *
     * @param id The id of the Duration that needs to be retrieved.
     * @return The Duration enumeration value based on the given id.
     */
    public static Duration parse(int id) {
        switch (id) {
            case 0:
                return MINUTES_3;
            case 1:
                return MINUTES_5;
            case 2:
                return MINUTES_10;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
