import org.junit.Before;
import org.junit.Test;
import parkfun.attractions.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster attractionInstance;

    @Before
    public void setUp() {
        attractionInstance = new Rollercoaster("The Big Dipper");
    }

    @Test
    public void hasName() {
        assertEquals("The Big Dipper", attractionInstance.getName());
    }
}
