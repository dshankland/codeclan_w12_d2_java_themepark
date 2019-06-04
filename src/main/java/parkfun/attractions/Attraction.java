package parkfun.attractions;

import parkfun.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    int rating;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
