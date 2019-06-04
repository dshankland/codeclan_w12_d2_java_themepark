package parkfun;

import org.w3c.dom.Attr;
import parkfun.attractions.Attraction;
import parkfun.stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        attractions = new ArrayList<Attraction>();
        stalls = new ArrayList<Stall>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStalls(Stall stall) {
        this.stalls.add(stall);
    }

    public void visit(Visitor visitor, Attraction attraction) {

    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }
}
