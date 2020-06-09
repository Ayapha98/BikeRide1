package bicycles.rides;

import bicycles.interfaces.Bicycle;

public class BikeRideOne implements BikeRide {
    private final Bicycle bicycle;
    private int speed;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    @Override
    public void ride(Bicycle bicycle) {
        {
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
        }
    }

    public int currentSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride(bicycle);

        System.out.println(bikeRideOne.currentSpeed());
    }
}
