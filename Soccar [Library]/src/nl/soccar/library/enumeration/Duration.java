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

    Duration(int id) {
        this.id = id;
    }

    public static Duration parse(int id) {
        if (id == MINUTES_3.id) {
            return MINUTES_3;
        }

        if (id == MINUTES_5.id) {
            return MINUTES_5;
        }

        if (id == MINUTES_10.id) {
            return MINUTES_10;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }

}
