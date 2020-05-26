package bicycles;

public class BikeRide {
    private final Bicycle bicycle;
    private int speed;

    public BikeRide (Bicycle bicycle){
        this.bicycle =bicycle;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    public int currentSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        System.out.println(bikeRide.currentSpeed());
    }
}
