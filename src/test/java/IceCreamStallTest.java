import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall stallInstance;

    @Before
    public void setUp() {
        stallInstance = new IceCreamStall("Ice Ice Baby", "Vanilla Ice", true);
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

}
