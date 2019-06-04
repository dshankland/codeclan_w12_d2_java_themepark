import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall stallInstance;

    @Before
    public void setUp() {
        stallInstance = new CandyFlossStall("Cotton Candy", "Sweet Tooth Billy", false);
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
}
