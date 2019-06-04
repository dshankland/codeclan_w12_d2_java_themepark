package parkfun.attractions;

import parkfun.ITicketed;
import parkfun.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.5;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.defaultPrice() / 2;
        }
        return this.defaultPrice();
    }
}
