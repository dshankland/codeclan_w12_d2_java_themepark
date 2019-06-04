import org.junit.Before;
import org.junit.Test;
import parkfun.attractions.Park;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park attractionInstance;

    @Before
    public void setUp() {
        attractionInstance = new Park("Codeclan Themepark", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Codeclan Themepark", attractionInstance.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(2, attractionInstance.getRating());
    }

}
