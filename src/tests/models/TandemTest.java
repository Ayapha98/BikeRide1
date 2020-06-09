package tests.models;

import bicycles.interfaces.BicycleOne;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemTest {
    @Test
    public void shouldAccelerate() {

        BicycleOne bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        BicycleOne bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());
    }

}