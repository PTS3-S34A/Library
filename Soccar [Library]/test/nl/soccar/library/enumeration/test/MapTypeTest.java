package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.MapType;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the MapType enumeration.
 *
 * @author PTS34A
 */
public class MapTypeTest {

    // Declaration of test object.
    private MapType mapType;

    @Before
    public void setUp() {
        mapType = MapType.GRASSLAND;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, mapType.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(MapType.GRASSLAND, MapType.parse(0));
        assertEquals(MapType.MOON, MapType.parse(1));
        assertEquals(MapType.DESERT, MapType.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        MapType.parse(10);
    }

}
