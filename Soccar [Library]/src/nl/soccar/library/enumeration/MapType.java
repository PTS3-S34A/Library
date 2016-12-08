package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Map types in the game.
 * 
 * @author PTS34
 */
public enum MapType {
    
    GRASSLAND(0),
    MOON(1),
    DESERT(2);
    
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
                return MOON;
            case 2:
                return DESERT;
            default:
                throw new IllegalArgumentException("Invalid id.");
        }
    }
    
}
