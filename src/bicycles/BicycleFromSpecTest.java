package bicycles;

import models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleFromSpecTest {

    @Test
    public void shouldPerformMultipleBrakeAndAccelerateOnMountainBike() {
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBikeSpecs = new BicycleFromSpec(mountainBike);

        assertEquals(0, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.accelerate();
        assertEquals(5, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.brake();
        assertEquals(2, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.accelerate();
        assertEquals(7, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.accelerate();
        assertEquals(12, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.accelerate();
        assertEquals(17, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.brake();
        assertEquals(14, mountainBikeSpecs.currentSpeed());
    }

    @Test
    public void shouldStopAMountainBike() {
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        BicycleFromSpec mountainBikeSpecs = new BicycleFromSpec(mountainBike);


        assertEquals(0, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.accelerate();
        assertEquals(5, mountainBikeSpecs.currentSpeed());
        mountainBikeSpecs.brake();
        mountainBikeSpecs.stop();
        assertEquals(0, mountainBikeSpecs.currentSpeed());
    }
}