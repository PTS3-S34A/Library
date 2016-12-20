package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Ball types in the game.
 *
 * @author PTS34
 */
public enum BallType {

    FOOTBALL(0),
    PUCK(1),
    SNOWBALL(2);

    private final int id;

    BallType(int id) {
        this.id = id;
    }
    
    /**
     * Gets the id of the BallType enumeration value.
     *
     * @return The id of the BallType enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the BallType enumeration value based on the given id.
     *
     * @param id The id of the BallType that needs to be retrieved.
     * @return The BallType enumeration value based on the given id.
     */

    public static BallType parse(int id) {
        if (id == FOOTBALL.id) {
            return FOOTBALL;
        }

        if (id == PUCK.id) {
            return PUCK;
        }

        if (id == SNOWBALL.id) {
            return SNOWBALL;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

}
