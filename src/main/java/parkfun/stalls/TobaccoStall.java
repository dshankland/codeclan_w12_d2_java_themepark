package parkfun.stalls;

import parkfun.ISecurity;
import parkfun.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, boolean parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 15) {
            return true;
        }
        return false;
    }
}
