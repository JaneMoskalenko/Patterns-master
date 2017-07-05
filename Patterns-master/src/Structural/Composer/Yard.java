package Structural.Composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */

public class Yard implements UnitInterface<Building> {

    List<Building> containingBuildings = new ArrayList<>();
    Long budget;

    public Yard(Long budget) {
        this.budget = budget;
    }

    @Override
    public void add(Building element) {
        containingBuildings.add(element);
    }

    @Override
    public void remove(Building element) {
        containingBuildings.remove(element);
    }

    @Override
    public List<Building> getList() {
        return containingBuildings;
    }

    @Override
    public HashMap countEverything(HashMap hashMap) {
        for(Building bld : containingBuildings) {
            bld.countEverything(hashMap);
        }
            if (hashMap.containsKey("YardBudget"))
                hashMap.put("YardBudget", ((Long) hashMap.get("YardBudget")) + budget);
            else hashMap.put("YardBudget", budget);

        return hashMap;
    }
}
