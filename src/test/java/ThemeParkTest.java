import org.junit.Before;
import org.junit.Test;
import parkfun.ThemePark;
import parkfun.Visitor;
import parkfun.attractions.Rollercoaster;
import parkfun.stalls.CandyFlossStall;
import parkfun.stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark;
    private CandyFlossStall candyFlossStall;
    private Rollercoaster rollerCoaster;
    private TobaccoStall tobaccoStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        themepark = new ThemePark();
        candyFlossStall = new CandyFlossStall("Cotton Candy", "Sweet Tooth Billy", false, 5);
        rollerCoaster = new Rollercoaster("The Big Dipper", 9);
        tobaccoStall = new TobaccoStall("Smokey Joes", "Joe Smoke", false, 2);
        themepark.addAttraction(rollerCoaster);
        themepark.addStalls(candyFlossStall);
        themepark.addStalls(tobaccoStall);
        visitor1 = new Visitor(12, 1.0, 20.00);
        visitor2 = new Visitor(18, 1.6, 25.00);
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(3, themepark.getAllReviewed().size());
    }
}
