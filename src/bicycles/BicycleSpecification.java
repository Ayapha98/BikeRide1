package bicycles;

import models.BicycleType;


public class BicycleSpecification {


        private int accelerationSpeed;
        private int brakeSpeed;
        private BicycleType bicycleType;

        public BicycleSpecification( BicycleType bicycle){
            this.accelerationSpeed = bicycle.getAccelerationSpeed();
            this.brakeSpeed = bicycle.getBrakeSpeed();
            this.bicycleType = bicycle;
        }


        public int getAccelerationSpeed() {
            return accelerationSpeed;
        }

        public int getBrakeSpeed() {
            return brakeSpeed;
        }

        public BicycleType getBicycleType() {
            return bicycleType;
        }

        public static void main(String[] args) {
            BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.MountainBike);

            System.out.println(roadBikeSpec.getAccelerationSpeed());

            System.out.println(roadBikeSpec.getBrakeSpeed());

            BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.RoadBike);

            System.out.println(mountainBikeSpec.getAccelerationSpeed());

            System.out.println(mountainBikeSpec.getBrakeSpeed());
        }
    }
