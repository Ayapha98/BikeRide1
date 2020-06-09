package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideThreeTest {

    @Test
    public void shouldTakeBikeThreeForARide(){
        Bicycle bicycle = new Bicycle();
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride(bicycle);
        assertEquals(24, bicycle.currentSpeed());
    }
}