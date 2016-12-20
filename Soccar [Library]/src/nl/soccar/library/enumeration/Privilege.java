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

    private Privilege(int id) {
        this.id = id;
    }
    
    /**
     * Gets the id of the Privilege enumeration value.
     *
     * @return The id of the Privilege enumeration value.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the Privilege enumeration value based on the given id.
     *
     * @param id The id of the Privilege that needs to be retrieved.
     * @return The Privilege enumeration value based on the given id.
     */
    public static Privilege parse(int id) {
        switch (id) {
            case 0:
                return GUEST;
            case 1:
                return NORMAL;
            case 2:
                return ADMINISTRATOR;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
