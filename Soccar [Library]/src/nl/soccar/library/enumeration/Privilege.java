package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Player privileges in the game.
 *
 * @author PTS34
 */
public enum Privilege {

    GUEST(0),
    NORMAL(1),
    ADMINISTRATOR(2);

    private final int id;

    Privilege(int id) {
        this.id = id;
    }

    public static Privilege parse(int id) {
        if (id == GUEST.id) {
            return GUEST;
        }

        if (id == NORMAL.id) {
            return NORMAL;
        }

        if (id == ADMINISTRATOR.id) {
            return ADMINISTRATOR;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }
}
