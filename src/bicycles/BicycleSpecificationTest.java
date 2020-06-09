package bicycles;

import models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleSpecificationTest {

    @Test
    public void shouldCheckTheTypeOfBicycle(){
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
    }

    @Test
    public void shouldGetAccelerationSpeedOfAMountainBike(){
        BicycleSpecification mountainBike2 = new BicycleSpecification(BicycleType.MountainBike);
        mountainBike2.getAccelerationSpeed();
        assertEquals(5, mountainBike2.getAccelerationSpeed());
    }

    @Test
    public void shouldGetBrakeSpeedOfAMountainBike(){
        BicycleSpecification mountainBike3 = new BicycleSpecification(BicycleType.MountainBike);
        mountainBike3.getBrakeSpeed();
        assertEquals(-3, mountainBike3.getBrakeSpeed());

    }

    @Test
    public void shouldCheckTheTypeOfBicycleForRoadBike(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }

    @Test
    public void shouldGetAccelerationSpeedOfARoadBike(){
        BicycleSpecification roadBike2 = new BicycleSpecification(BicycleType.RoadBike);
      roadBike2.getAccelerationSpeed();
        assertEquals(11, roadBike2.getAccelerationSpeed());
    }

    @Test
    public void shouldGetBrakeSpeedOfARoadBike(){
        BicycleSpecification roadBike3 = new BicycleSpecification(BicycleType.RoadBike);
        roadBike3.getBrakeSpeed();
        assertEquals(-4, roadBike3.getBrakeSpeed());

    }

    @Test
    public void shouldCheckTheTypeOfBicycleForTandem(){
        BicycleSpecification tandem= new BicycleSpecification(BicycleType.Tandem);
        assertEquals(BicycleType.Tandem, tandem.getBicycleType());
    }

    @Test
    public void shouldGetAccelerationSpeedOfATandem(){
        BicycleSpecification tandem2 = new BicycleSpecification(BicycleType.Tandem);
        tandem2.getAccelerationSpeed();
        assertEquals(12, tandem2.getAccelerationSpeed());
    }

    @Test
    public void shouldGetBrakeSpeedOfATandem(){
        BicycleSpecification tandem3 = new BicycleSpecification(BicycleType.Tandem);
        tandem3.getBrakeSpeed();
        assertEquals(-7, tandem3.getBrakeSpeed());

    }



}