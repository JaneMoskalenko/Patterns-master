/**
 * Created by admin on 05.07.2017.
 */
public class InternetRumours  extends Rumour{
    boolean isConnected;

    public InternetRumours(boolean isConnected) {
        this.isConnected = isConnected;
    }

    @Override
    public void obs(String rumour) {
        if (!isConnected) {
            System.out.println("Internet isnt connectd");
            return;
        }
        System.out.println("THEY Wrote");
        if (next!=null) {
            next.obs(rumour);
        }

    }
}
