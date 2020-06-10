package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private int  maxNumberOfBikesInFunRide;

    public FunRide(int maxNumberOfBikes){
        this.maxNumberOfBikesInFunRide = maxNumberOfBikes;
    }

    private List <Bicycle> bicycleList = new ArrayList<Bicycle>();

    public void accept(Bicycle bicycle){
        if (bicycleList.size() <maxNumberOfBikesInFunRide && !bicycleList.contains(bicycle)){
            bicycleList.add(bicycle);
        }

    }

    public int getEnteredCount(){
        return bicycleList.size();
    }


    public int getCountForType(BicycleType type) {


    }
}
