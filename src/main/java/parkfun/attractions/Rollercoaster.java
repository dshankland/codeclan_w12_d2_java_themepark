package parkfun.attractions;

import parkfun.ISecurity;
import parkfun.ITicketed;
import parkfun.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if ((visitor.getAge() >= 12) && (visitor.getHeight() >= 1.45)) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return 2 * this.defaultPrice();
        }
        return this.defaultPrice();
    }
}
