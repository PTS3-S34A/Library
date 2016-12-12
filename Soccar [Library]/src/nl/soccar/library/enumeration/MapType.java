package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Map types in the game.
 * 
 * @author PTS34
 */
public enum MapType {
    
    GRASSLAND(0),
    ICE(1),
    CHRISTMAS(2);
    
    private final int id;

    private MapType(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public static MapType parse(int id) {
        switch (id) {
            case 0:
                return GRASSLAND;
            case 1:
                return ICE;
            case 2:
                return CHRISTMAS;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
