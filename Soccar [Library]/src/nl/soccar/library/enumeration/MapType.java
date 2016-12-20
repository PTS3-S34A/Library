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

    MapType(int id) {
        this.id = id;
    }

    public static MapType parse(int id) {
        if (id == GRASSLAND.id) {
            return GRASSLAND;
        }

        if (id == ICE.id) {
            return ICE;
        }

        if (id == CHRISTMAS.id) {
            return CHRISTMAS;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }

}
