package nl.soccar.library.test;

import nl.soccar.library.Car;
import nl.soccar.library.Player;
import nl.soccar.library.enumeration.CarType;
import nl.soccar.library.enumeration.HandbrakeAction;
import nl.soccar.library.enumeration.Privilege;
import nl.soccar.library.enumeration.SteerAction;
import nl.soccar.library.enumeration.ThrottleAction;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test that tests the nl.soccar.library.Car class.
 *
 * @author PTS34A
 */
public class CarTest {

    //Declaration of test objects.
    private Player player;
    private Car car;

    /**
     * Instantiation of test objects.
     */
    @Before
    public void setUp() {
        player = new Player("username", Privilege.NORMAL, CarType.CASUAL);
        car = new Car(1.0F, 2.0F, 3.0F, CarType.CASUAL, player);
    }

    /**
     * Tests the move method.
     */
    @Test
    public void moveTest() {
        float newX = 1.0F;
        float newY = 1.0F;
        float newDegree = 1.0F;

        car.move(newX, newY, newDegree);

        assertSame(Math.round(newX), Math.round(car.getX()));
        assertSame(Math.round(newY), Math.round(car.getY()));
        assertSame(Math.round(newDegree), Math.round(car.getDegree()));
    }

    /**
     * Tests the getX method.
     */
    @Test
    public void getXTest() {
        assertEquals(Math.round(1.0F), Math.round(car.getX()));
    }

    /**
     * Tests the getY method.
     */
    @Test
    public void getYTest() {
        assertEquals(Math.round(2.0F), Math.round(car.getY()));
    }

    /**
     * Tests the getDegree method.
     */
    @Test
    public void getDegreeTest() {
        assertEquals(Math.round(3.0F), Math.round(car.getDegree()));
    }

    /**
     * Tests the getWidth method.
     */
    @Test
    public void getWidthTest() {
        assertEquals(Math.round(Car.CAR_WIDTH), Math.round(car.getWidth()));
    }

    /**
     * Tests the getHeight method.
     */
    @Test
    public void getHeightTest() {
        assertEquals(Math.round(Car.CAR_WIDTH * 2.35F), Math.round(car.getHeight()));
    }

    /**
     * Tests the getWheelWidth method.
     */
    @Test
    public void getWheelWidthTest() {
        assertEquals(Math.round(car.getWidth() / 5.0F), Math.round(car.getWheelWidth()));
    }

    /**
     * Tests the getWheelHeight method.
     */
    @Test
    public void getWheelHeightTest() {
        assertEquals(Math.round(car.getWheelWidth() * 2.0F), Math.round(car.getWheelWidth()));
    }

    /**
     * Tests the getBooster method.
     */
    @Test
    public void getBooster() {
        assertEquals(0, car.getBooster());
    }

    /**
     * Tests the getCarType method.
     */
    @Test
    public void getCarTypeTest() {
        assertEquals(CarType.CASUAL, car.getCarType());
    }

    /**
     * Tests the getPlayer method.
     */
    @Test
    public void getPlayer() {
        assertEquals(player, car.getPlayer());
    }

    /**
     * Tests the getSteerActionAndSetSteerAction methods.
     */
    @Test
    public void getSteerActionAndSetSteerActionTest() {
        car.setSteerAction(SteerAction.STEER_LEFT);
        assertEquals(SteerAction.STEER_LEFT, car.getSteerAction());
    }

    /**
     * Tests the getThrottleActionAndSetThrottleAction methods.
     */
    @Test
    public void getThrottleActionAndSetThrottleActionTest() {
        car.setThrottleAction(ThrottleAction.ACCELERATE);
        assertEquals(ThrottleAction.ACCELERATE, car.getThrottleAction());
    }

    /**
     * Tests the getHandbrakeActionAndSetHandbrakeActions methods.
     */
    @Test
    public void getHandbrakeActionAndSetHandbrakeActionTest() {
        car.setHandbrakeAction(HandbrakeAction.ACTIVE.ACTIVE);
        assertEquals(HandbrakeAction.ACTIVE, car.getHandbrakeAction());
    }

}
