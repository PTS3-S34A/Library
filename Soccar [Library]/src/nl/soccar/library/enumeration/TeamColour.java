package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Team colours in the game.
 *
 * @author PTS34
 */
public enum TeamColour {

    BLUE(0),
    RED(1);

    private final int id;

    TeamColour(int id) {
        this.id = id;
    }
    
    /**
     * Gets the id of the TeamColour enumeration value.
     *
     * @return The id of the TeamColour enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the TeamColour enumeration value based on the given id.
     *
     * @param id The id of the TeamColour that needs to be retrieved.
     * @return The TeamColour enumeration value based on the given id.
     */

    public static TeamColour parse(int id) {
        if (id == BLUE.id) {
            return BLUE;
        }

        if (id == RED.id) {
            return RED;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

}
