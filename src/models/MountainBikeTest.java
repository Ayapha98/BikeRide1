package models;


import bicycles.BicycleOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest{
    @Test
    public void shouldAccelerate() {

        BicycleOne bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        BicycleOne bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        BicycleOne bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        BicycleOne bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        BicycleOne bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

}