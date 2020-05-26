package models;

import bicycles.BicycleBase;
import bicycles.BicycleOne;

public class RoadBike extends BicycleBase {

    public void accelerate(){
        changeSpeed(11);
    }

    public void brake(){
        changeSpeed(-4);
    }
}
