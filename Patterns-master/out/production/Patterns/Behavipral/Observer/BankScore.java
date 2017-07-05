import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05.07.2017.
 */
public class BankScore  implements Observable{
    private List<Observer> observers;

    public BankScore() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @java.lang.Override
    public void notifyAllObservers(Observer observer) {
        observers.forEach(Observer::message);
    }

}
