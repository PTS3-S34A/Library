package nl.soccar.library.enumeration;

/**
 * Enumeration of all available match event types in the game.
 * 
 * @author PTS34
 */
public enum EventType {

    GOAL_RED(0),
    GOAL_BLUE(1),
    ASSIST(2);

    private final int id;

    /**
     * Gets the EventType enumeration value based on the given id.
     *
     * @param id The id of the EventType that needs to be retrieved.
     * @return The EventType enumeration value based on the given id.
     */
    EventType(int id) {
        this.id = id;
    }

    /**
     * Gets the EventType enumeration value based on the given id.
     *
     * @param id The id of the EventType that needs to be retrieved.
     * @return The EventType enumeration value based on the given id.
     */
    public static EventType parse(int id) {
        if (id == GOAL_RED.id) {
            return GOAL_RED;
        }

        if (id == GOAL_BLUE.id) {
            return GOAL_BLUE;
        }

        if (id == ASSIST.id) {
            return ASSIST;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    /**
     * Gets the id of the EventType enumeration value.
     *
     * @return The id of the EventType enumeration value.
     */
    public int getId() {
        return id;
    }
    
}
