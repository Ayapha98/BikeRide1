package bicycles.rides;

import bicycles.interfaces.Bicycle;

public class BikeRideThree implements BikeRide {

    private final Bicycle bicycle;
    private int speed;

    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public int currentSpeed() {
        return speed;
    }

    @Override
    public void ride(Bicycle bicycle) {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();

    }
}
