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
    
    private HandbrakeAction(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public static HandbrakeAction parse(int id) {
        switch (id) {
            case 0:
                return ACTIVE;
            case 1:
                return INACTIVE;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
