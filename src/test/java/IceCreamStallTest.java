import parkfun.Visitor;
import parkfun.stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall stallInstance;
    private Visitor visitor1;

    @Before
    public void setUp() {
        visitor1 = new Visitor(12, 1.0, 2.00);
        stallInstance = new IceCreamStall("Ice Ice Baby", "Vanilla Ice", true, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Ice Ice Baby", stallInstance.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Vanilla Ice", stallInstance.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(true, stallInstance.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(6, stallInstance.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.5, stallInstance.defaultPrice(), 0.0);
    }

    @Test
    public void hasPriceForVisitor() {
        assertEquals(2.5, stallInstance.priceFor(visitor1), 0.0);
    }

}
