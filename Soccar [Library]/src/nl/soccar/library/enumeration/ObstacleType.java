package nl.soccar.library.enumeration;

/**
 * Enumeration of all available obstacle types in the game.
 * 
 * @author PTS34A
 */
public enum ObstacleType {

    WALL(0);

    private final int id;

    ObstacleType(int id) {
        this.id = id;
    }

    /**
     * Gets the Obstacle enumeration value based on the given id.
     *
     * @param id The id of the Obstacle that needs to be retrieved.
     * @return The Obstacle enumeration value based on the given id.
     */
    public static ObstacleType parse(int id) {
        if (id == WALL.id) {
            return WALL;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    /**
     * Gets the id of the Obstacle enumeration value.
     *
     * @return The id of the Obstacle enumeration value.
     */
    public int getId() {
        return id;
    }
    
}
