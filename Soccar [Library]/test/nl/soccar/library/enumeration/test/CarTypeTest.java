package nl.soccar.library.enumeration.test;

import nl.soccar.library.enumeration.CarType;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the CarType enumeration.
 *
 * @author PTS34A
 */
public class CarTypeTest {

    // Declaration of test object.
    private CarType carType;

    @Before
    public void setUp() {
        carType = CarType.SPORTSCAR;
    }

    /**
     * Tests the getId method.
     */
    @Test
    public void getIdTest() {
        assertEquals(0, carType.getId());
    }

    /**
     * Tests the parse method.
     */
    @Test
    public void parseTest() {
        assertEquals(CarType.SPORTSCAR, CarType.parse(0));
        assertEquals(CarType.PICKUP, CarType.parse(1));
        assertEquals(CarType.CASUAL, CarType.parse(2));
    }

    /**
     * Tests the exception that is thrown by the parse method when an illegal id
     * is passed into the method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void parseIllegalArgumentExceptionTest() {
        CarType.parse(10);
    }

}
