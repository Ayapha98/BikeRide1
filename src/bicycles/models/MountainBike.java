package bicycles.models;

import bicycles.interfaces.BicycleBase;

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
