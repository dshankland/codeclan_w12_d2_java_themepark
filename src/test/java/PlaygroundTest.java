import Attractions.Park;
import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground attractionInstance;

    @Before
    public void setUp() {
        attractionInstance = new Playground("Codeclan Soft Play");
    }

    @Test
    public void hasName() {
        assertEquals("Codeclan Soft Play", attractionInstance.getName());
    }
}
