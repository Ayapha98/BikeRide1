package tests.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeRideTwoTest {
    @Test
    public void shouldTakeBIkeRideTwoForARide(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideTwo aRide = new BikeRideTwo(rideBike);
        aRide.ride(rideBike);

        assertEquals(69,aRide.currentSpeed());
    }
}
