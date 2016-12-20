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

    public int getId() {
        return id;
    }
}
