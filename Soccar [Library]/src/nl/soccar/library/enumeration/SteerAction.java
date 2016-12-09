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
    
    private SteerAction(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public static SteerAction parse(int id) {
        switch (id) {
            case 0:
                return NONE;
            case 1:
                return STEER_LEFT;
            case 2:
                return STEER_RIGHT;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
