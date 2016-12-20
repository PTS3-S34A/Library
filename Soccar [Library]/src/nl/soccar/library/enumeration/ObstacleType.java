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

    public static ObstacleType parse(int id) {
        if (id == WALL.id) {
            return WALL;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }
    
}
