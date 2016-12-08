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

    private Duration(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public static Duration parse(int id) {
        switch (id) {
            case 0:
                return MINUTES_3;
            case 1:
                return MINUTES_5;
            case 2:
                return MINUTES_10;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
