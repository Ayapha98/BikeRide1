package tests.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.FunRide;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunRideTest {

    @Test
    public void testAcceptMethod(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);


        FunRide funRide = new FunRide(6);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);


        assertEquals(3, funRide.getEnteredCount());
    }


    @Test
    public void shouldTestGetCountForTypeMethod(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification tandemSpec = new BicycleSpecification(BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        BicycleSpecification roadBikeSpec2 = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle roadBike2 = new BicycleFromSpec(roadBikeSpec2);

        BicycleSpecification mountainBikeSpec2 = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mountainBike2 = new BicycleFromSpec(mountainBikeSpec2);

        BicycleSpecification tandemSpec2 = new BicycleSpecification(BicycleType.Tandem);
        Bicycle tandem2 = new BicycleFromSpec(tandemSpec2);

        FunRide funRide = new FunRide(5);

        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike2);
        funRide.accept(mountainBike2);
        funRide.accept(tandem2);

        assertEquals(2,funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
        assertEquals(2,funRide.getCountForType(BicycleType.RoadBike));



    }

}