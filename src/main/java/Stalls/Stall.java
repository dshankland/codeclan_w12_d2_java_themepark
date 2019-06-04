package Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private boolean parkingSpot;

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
