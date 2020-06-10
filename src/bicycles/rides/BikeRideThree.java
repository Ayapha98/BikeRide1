package bicycles.rides;

import bicycles.interfaces.Bicycle;

public class BikeRideThree implements BikeRide {

    Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public void ride(Bicycle bicycle){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

}
