package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideTest {
    @Test
    public void shouldTakeBIkeForARide(){
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(14, bicycle.currentSpeed());
    }

}