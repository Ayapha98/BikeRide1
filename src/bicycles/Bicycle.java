package bicycles;

public class Bicycle {
    private int speed;

    public void accelerate(){
        speed +=5;
    }

    public void brake(){
        if (speed > 3) {
            speed -= 3;
        } else {
            speed = 0;
        }
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed =0;
    }
}
