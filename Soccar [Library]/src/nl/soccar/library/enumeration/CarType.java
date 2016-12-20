package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Car types in the game.
 *
 * @author PTS34
 */
public enum CarType {

    SPORTSCAR(0),
    PICKUP(1),
    CASUAL(2);

    private final int id;

    private CarType(int id) {
        this.id = id;
    }

    /**
     * Gets the id of the CarType enumeration value.
     *
     * @return The id of the CarType enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the CarType enumeration value based on the given id.
     *
     * @param id The id of the CarType that needs to be retrieved.
     * @return The CarType enumeration value based on the given id.
     */
    public static CarType parse(int id) {
        switch (id) {
            case 0:
                return SPORTSCAR;
            case 1:
                return PICKUP;
            case 2:
                return CASUAL;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
