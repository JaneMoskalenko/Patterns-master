package Structural.Adapter;

import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public interface ISocialWeb {

    List<String> getWall(Long id, boolean showHidden);

    String getFriend(Long id);

    void pay(float amount, float currencyCoefficient, Long id);


}
