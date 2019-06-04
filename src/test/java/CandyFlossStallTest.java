import parkfun.Visitor;
import parkfun.stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall stallInstance;
    private Visitor visitor1;

    @Before
    public void setUp() {
        visitor1 = new Visitor(12, 1.0, 2.00);
        stallInstance = new CandyFlossStall("Cotton Candy", "Sweet Tooth Billy", false, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Cotton Candy", stallInstance.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Sweet Tooth Billy", stallInstance.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(false, stallInstance.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(5, stallInstance.getRating());
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
