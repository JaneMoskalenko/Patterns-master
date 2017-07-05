/**
 * Created by admin on 05.07.2017.
 */
public class NewsPaperRumour extends Rumour {

    Integer balance;

    public NewsPaperRumour(Integer balance) {
        this.balance = balance;
    }


    @Override
    public void obs(String rumour) {
        if (balance==0){
            System.out.println("Sorry, bankrout" + rumour);
            return;
        }
        System.out.println("Newspaper wrote" + rumour);
        if (next !=null) {
            next.obs(rumour);
        }
    }
}
