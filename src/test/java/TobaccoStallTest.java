import parkfun.stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall stallInstance;

    @Before
    public void setUp() {
        stallInstance = new TobaccoStall("Smokey Joes", "Smokey Joe", false);
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

}
