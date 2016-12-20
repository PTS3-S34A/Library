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

    HandbrakeAction(int id) {
        this.id = id;
    }

    public static HandbrakeAction parse(int id) {
        if (id == ACTIVE.id) {
            return ACTIVE;
        }

        if (id == INACTIVE.id) {
            return INACTIVE;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }
}
