package parkfun.stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private boolean parkingSpot;
    int rating;

    public Stall(String name, String ownerName, boolean parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean getParkingSpot() {
        return parkingSpot;
    }
}
