package nl.soccar.library.enumeration;

/**
 * Enumeration for the available throttle actions.
 * 
 * @author PTS34A
 */
public enum ThrottleAction {
    
    IDLE(0),
    ACCELERATE(1),
    REVERSE(2);
    BOOST(3);

    private final int id;

    private ThrottleAction(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ThrottleAction parse(int id) {
        switch (id) {
            case 0:
                return IDLE;
            case 1:
                return ACCELERATE;
            case 2:
                return REVERSE;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
