package Structural.Composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class Area implements UnitInterface<City> {

    List<City> containingCities = new ArrayList<>();

    @Override
    public void add(City element) {
        containingCities.add(element);
    }

    @Override
    public void remove(City element) {
        containingCities.remove(element);
    }

    @Override
    public List<City> getList() {
        return containingCities;
    }

    @Override
    public HashMap countEverything(HashMap hashMap) {
        for(City cty : containingCities) {
            cty.countEverything(hashMap);
        }
        return hashMap;
    }
}
