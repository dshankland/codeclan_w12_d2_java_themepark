import org.junit.Before;
import org.junit.Test;
import parkfun.Visitor;
import parkfun.attractions.Playground;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground attractionInstance;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        visitor1 = new Visitor(12, 1.0, 2.00);
        visitor2 = new Visitor(18, 1.6, 5.00);
        attractionInstance = new Playground("Codeclan Soft Play", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Codeclan Soft Play", attractionInstance.getName());
    }

    @Test
    public void canUseAttraction() {
        assertEquals(true, attractionInstance.isAllowedTo(visitor1));
    }

    @Test
    public void cannotUseAttraction() {
        assertEquals(false, attractionInstance.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating() {
        assertEquals(4, attractionInstance.getRating());
    }

}
