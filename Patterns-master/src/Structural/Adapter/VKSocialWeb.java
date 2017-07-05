package Structural.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sa on 04.07.17.
 */
public class VKSocialWeb{

    public List<String> getWall(int id, int likes, boolean showHidden) {
        return id > likes ? new ArrayList<>() : Arrays.asList("a", "b");
    }

    public String getFriend(int id, boolean showHidden) {
        if(id < 1000 && !showHidden)
            return "";
        else
            return "Friend " + id;
    }

    public boolean pay(float amount, int id) {
        System.out.println("You paid " + amount + " to " + id + " in VK.");
        return true;
    }
}
