package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideTwoTest {
    @Test
    public void shouldTakeBIkeForARide(){
        Bicycle bicycle = new Bicycle();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride(bicycle);
        assertEquals(28, bicycle.currentSpeed());
    }

}
