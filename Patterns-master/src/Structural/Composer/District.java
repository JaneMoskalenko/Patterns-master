package Structural.Composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class District implements UnitInterface<Yard> {

    List<Yard> containingYards = new ArrayList<>();
    Double area;

    public District(Double area) {
        this.area = area;
    }

    @Override
    public void add(Yard element) {
        containingYards.add(element);
    }

    @Override
    public void remove(Yard element) {
        containingYards.remove(element);
    }

    @Override
    public List<Yard> getList() {
        return containingYards;
    }

    @Override
    public HashMap countEverything(HashMap hashMap) {
        for(Yard yrd : containingYards) {
            yrd.countEverything(hashMap);
        }
        if(hashMap.containsKey("Area"))
            hashMap.put("Area", ((Double) hashMap.get("Area")) + area);
        else hashMap.put("Area", area);
        return hashMap;
    }
}
