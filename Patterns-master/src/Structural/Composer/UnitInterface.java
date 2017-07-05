package Structural.Composer;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public interface UnitInterface<T extends UnitInterface> {

    void add(T element);

    void remove(T element);

    List<T> getList();

    HashMap countEverything(HashMap hashMap);

}
