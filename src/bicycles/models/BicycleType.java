package bicycles.models;

public enum BicycleType {
    MountainBike(5, -3),
    RoadBike(11, -4),
    Tandem(12, -7);

    private final int accelerationSpeed;
    private final int brakeSpeed;

    BicycleType(int accelerationSpeed, int brakeSpeed){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }
}