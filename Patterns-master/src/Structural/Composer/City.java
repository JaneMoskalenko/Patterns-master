package Structural.Composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class City implements UnitInterface<District> {

    List<District> containingDistricts = new ArrayList<>();
    Double taxes;

    public City(Double taxes) {
        this.taxes = taxes;
    }

    @Override
    public void add(District element) {
        containingDistricts.add(element);
    }

    @Override
    public void remove(District element) {
        containingDistricts.remove(element);
    }

    @Override
    public List<District> getList() {
        return containingDistricts;
    }

    @Override
    public HashMap countEverything(HashMap hashMap) {
        for(District dstrct : containingDistricts) {
            dstrct.countEverything(hashMap);
        }
        if(hashMap.containsKey("Taxes"))
            hashMap.put("Taxes", ((Double) hashMap.get("Taxes")) + taxes);
        else hashMap.put("Taxes", taxes);
        return hashMap;
    }
}
