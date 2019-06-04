import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems attractionInstance;

    @Before
    public void setUp() {
        attractionInstance = new Dodgems("Roger Dodger");
    }

    @Test
    public void hasName() {
        assertEquals("Roger Dodger", attractionInstance.getName());
    }
}
