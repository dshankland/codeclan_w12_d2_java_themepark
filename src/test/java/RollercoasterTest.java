import org.junit.Before;
import org.junit.Test;
import parkfun.Visitor;
import parkfun.attractions.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster attractionInstance;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;


    @Before
    public void setUp() {
        visitor1 = new Visitor(12, 1.0, 2.00);
        visitor2 = new Visitor(18, 1.6, 5.00);
        visitor3 = new Visitor(18, 2.1, 5.00);
        attractionInstance = new Rollercoaster("The Big Dipper", 9);
    }

    @Test
    public void hasName() {
        assertEquals("The Big Dipper", attractionInstance.getName());
    }

    @Test
    public void canUseAttraction() {
        assertEquals(true, attractionInstance.isAllowedTo(visitor2));
    }

    @Test
    public void cannotUseAttraction() {
        assertEquals(false, attractionInstance.isAllowedTo(visitor1));
    }

    @Test
    public void canGetRating() {
        assertEquals(9, attractionInstance.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, attractionInstance.defaultPrice(), 0.0);
    }

    @Test
    public void costsDefaultForNormalSizePeople() {
        assertEquals(8.40, attractionInstance.priceFor(visitor2), 0.0);
    }

    @Test
    public void costsDoubleForTallPeople() {
        assertEquals(16.80, attractionInstance.priceFor(visitor3), 0.0);
    }
}
