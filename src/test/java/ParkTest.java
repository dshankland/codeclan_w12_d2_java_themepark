import Attractions.Dodgems;
import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park attractionInstance;

    @Before
    public void setUp() {
        attractionInstance = new Park("Codeclan Themepark");
    }

    @Test
    public void hasName() {
        assertEquals("Codeclan Themepark", attractionInstance.getName());
    }
}
