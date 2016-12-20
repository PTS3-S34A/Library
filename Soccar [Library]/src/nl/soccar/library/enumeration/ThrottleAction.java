package nl.soccar.library.enumeration;

/**
 * Enumeration for the available throttle actions.
 *
 * @author PTS34A
 */
public enum ThrottleAction {

    IDLE(0),
    ACCELERATE(1),
    REVERSE(2),
    BOOST(3);

    private final int id;

    ThrottleAction(int id) {
        this.id = id;
    }

    public static ThrottleAction parse(int id) {
        if (id == IDLE.id) {
            return IDLE;
        }

        if (id == ACCELERATE.id) {
            return ACCELERATE;
        }

        if (id == REVERSE.id) {
            return REVERSE;
        }

        if (id == BOOST.id) {
            return BOOST;
        }
        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }
}
