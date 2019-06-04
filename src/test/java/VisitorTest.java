import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor(21, 1.8, 35.00);
    }

    @Test
    public void hasAge() {
        assertEquals(21, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.8, visitor.getHeight(), 0.0);
    }

    @Test
    public void hasMoney() {
        assertEquals(35,visitor.getMoney(), 0.0);
    }

}
