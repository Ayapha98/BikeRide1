package tests.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeRideOneTest {
    @Test
    public void shouldTakeBIkeForARide(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.Tandem);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideOne aRide = new BikeRideOne(rideBike);
        aRide.ride(rideBike);

        assertEquals(34,aRide.currentSpeed());
    }

}