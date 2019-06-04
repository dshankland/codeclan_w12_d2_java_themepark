import org.junit.Before;
import org.junit.Test;
import parkfun.Visitor;
import parkfun.attractions.Dodgems;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems attractionInstance;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        visitor1 = new Visitor(13, 1.0, 20.00);
        visitor2 = new Visitor(11, 1.6, 15.00);
        attractionInstance = new Dodgems("Roger Dodger", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Roger Dodger", attractionInstance.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(7, attractionInstance.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, attractionInstance.defaultPrice(), 0.0);
    }

    @Test
    public void hasDefaultPriceForOver12s() {
        assertEquals(4.50, attractionInstance.priceFor(visitor1), 0.0);
    }

    @Test
    public void hasHalfPriceForUnder12s() {
        assertEquals(2.25, attractionInstance.priceFor(visitor2), 0.0);
    }

}
