package bicycles;

import models.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private BicycleSpecification bicycle;

    public BicycleFromSpec(BicycleSpecification bicycle){
        this.bicycle = bicycle;
    }


    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(this.bicycle.getBrakeSpeed());
    }

    @Override
    public BicycleType getBicycleType() {
        return this.bicycle.getBicycleType();
    }
}
