package nl.soccar.library.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import nl.soccar.library.MapConstants;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests all nl.soccar.library.MapConstants constants.
 *
 * @author Robin Laugs
 */
public class MapConstantsTest {

    @Test
    public void MapConstantsTest() {
        assertEquals(Math.round(160.0F), Math.round(MapConstants.MAP_WIDTH));
        assertEquals(Math.round(90.0F), Math.round(MapConstants.MAP_HEIGHT));
        assertEquals(Math.round(10.0F), Math.round(MapConstants.SCOREBOARD_WIDTH));
        assertEquals(Math.round(6.0F), Math.round(MapConstants.SCOREBOARD_HEIGHT));
        assertEquals(Math.round(0.2F), Math.round(MapConstants.LINE_WIDTH));
        assertEquals(Math.round(13.75F), Math.round(MapConstants.CENTRE_CIRCLE_SIZE));
        assertEquals(Math.round(1.5F), Math.round(MapConstants.CENTRE_SPOT_SIZE));
        assertEquals(Math.round(5.0F), Math.round(MapConstants.FIELD_MARGIN));
        assertEquals(Math.round(12.5F), Math.round(MapConstants.BOX_WIDTH));
        assertEquals(Math.round(32.5F), Math.round(MapConstants.BOX_HEIGHT));
        assertEquals(Math.round(3.5F), Math.round(MapConstants.GOAL_WIDTH));
        assertEquals(Math.round(MapConstants.BOX_HEIGHT / 1.5F), Math.round(MapConstants.GOAL_HEIGHT));
    }

    /**
     * Marks the private constructor of the MapConstants class as tested in JaCoCo.
     *
     * @throws NoSuchMethodException Does not apply.
     * @throws IllegalAccessException Does not apply.
     * @throws InvocationTargetException Does not apply.
     * @throws InstantiationException Does not apply.
     */
    @Test
    public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<MapConstants> constructor = MapConstants.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}
