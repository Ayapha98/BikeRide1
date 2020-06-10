package tests.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeRideThreeTest {

@Test
    public void shouldTakeBIkeRideThreeForARide(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideThree aRide = new BikeRideThree(rideBike);
        aRide.ride(rideBike);

        assertEquals(24,aRide.currentSpeed());
    }
}