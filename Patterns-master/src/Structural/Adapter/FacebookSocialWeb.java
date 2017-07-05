package Structural.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class FacebookSocialWeb{

    public List<String> getWall(Long id, boolean showHidden) {
        return id > 1_000_000 && !showHidden ? new ArrayList<>() : Arrays.asList("c", "d");
    }

    public String getFriend(Long id) {
        return "Friend " + id + " in FaceBook.";
    }

    public void pay(float amount, float currencyCoefficient, Long id) {
        System.out.println("You paid " + amount * currencyCoefficient + " to " + id + " in FaceBook.");
    }
}
