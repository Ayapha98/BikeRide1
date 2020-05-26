package models;

import bicycles.Bicycle;
import bicycles.BicycleOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadBikeTest {


    @Test
    public void shouldAccelerate() {
        BicycleOne bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {
        BicycleOne bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        BicycleOne bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        BicycleOne bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        BicycleOne bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

}