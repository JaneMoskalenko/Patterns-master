/**
 * Created by admin on 05.07.2017.
 */
public abstract class BabkiRumours extends Rumour {

    boolean isAlive;



    @Override
    public void obs(String rumour) {
        if (!isAlive){
            System.out.println("Sorry,  babka is dead");
            return;
        }
        System.out.println("Babka said" + rumour);
        if (next != null) {
            next.obs(rumour);
        }
    }
}
