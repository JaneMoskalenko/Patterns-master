package Structural.Composer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class Building implements UnitInterface {

    private Integer numberOfOccupants;

    public Building(Integer numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    @Override
    public void add(UnitInterface element) {

    }

    @Override
    public void remove(UnitInterface element) {

    }

    @Override
    public List<Integer> getList() {
        return Arrays.asList(numberOfOccupants);
    }

    @Override
    public HashMap countEverything(HashMap hashMap) {
        if(hashMap.containsKey("People"))
            hashMap.put("People", ((Integer) hashMap.get("People")) + numberOfOccupants);
        else hashMap.put("People", numberOfOccupants);
        return hashMap;
    }
}
