package bicycles.rides;

import bicycles.interfaces.Bicycle;

public class BikeRideTwo implements BikeRide {

    private final Bicycle bicycle;
    private int speed;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    @Override
    public void ride(Bicycle bicycle) {
        {
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
        }
    }

    public int currentSpeed() {
        return speed;
    }
}
