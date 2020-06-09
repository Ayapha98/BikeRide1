package tests.rides;

import bicycles.interfaces.Bicycle;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideOneTest {
    @Test
    public void shouldTakeBIkeForARide(){
        Bicycle bicycle = new Bicycle();
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride(bicycle);
        assertEquals(14, bicycle.currentSpeed());
    }

}