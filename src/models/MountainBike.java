package models;

import bicycles.BicycleBase;
import bicycles.BicycleOne;

public class MountainBike extends BicycleBase {


    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 3;
    }
}
