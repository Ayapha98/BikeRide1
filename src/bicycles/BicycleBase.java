package bicycles;

public abstract class BicycleBase implements BicycleOne{
        private int speed;
        public int currentSpeed(){
            return speed;
        }

        public void stop (){
            speed =0;
        }

        protected void changeSpeed(int speedChange){
            speed += speedChange;
        }
}
