package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Ball types in the game.
 *
 * @author PTS34
 */
public enum BallType {

    FOOTBALL(0),
    HOCKEY(1),
    BOWLING(2);
    
    private final int id;

    private BallType(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public static BallType parse(int id) {
        switch (id) {
            case 0:
                return FOOTBALL;
            case 1:
                return HOCKEY;
            case 2:
                return BOWLING;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }

}
