import parkfun.Visitor;
import parkfun.stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall stallInstance;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        visitor1 = new Visitor(12, 1.0, 2.00);
        visitor2 = new Visitor(18, 1.6, 5.00);
        stallInstance = new TobaccoStall("Smokey Joes", "Smokey Joe", false, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Smokey Joes", stallInstance.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Smokey Joe", stallInstance.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(false, stallInstance.getParkingSpot());
    }

    @Test
    public void canUseAttraction() {
        assertEquals(true, stallInstance.isAllowedTo(visitor2));
    }

    @Test
    public void cannotUseAttraction() {
        assertEquals(false, stallInstance.isAllowedTo(visitor1));
    }

    @Test
    public void canGetRating() {
        assertEquals(2, stallInstance.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.5, stallInstance.defaultPrice(), 0.0);
    }

    @Test
    public void hasPriceForVisitor() {
        assertEquals(2.5, stallInstance.priceFor(visitor2), 0.0);
    }


}
