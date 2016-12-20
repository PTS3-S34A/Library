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

    public int getId() {
        return id;
    }
}
