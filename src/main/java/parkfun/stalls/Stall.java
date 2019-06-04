package parkfun.stalls;

import parkfun.IReviewed;
import parkfun.ITicketed;
import parkfun.Visitor;

public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private boolean parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, boolean parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public boolean getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating() {
        return this.rating;
    }

    public double defaultPrice() {
        return 2.50;
    }

    public double priceFor(Visitor visitor) {
        return this.defaultPrice();
    }
}
