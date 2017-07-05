/**
 * Created by admin on 05.07.2017.
 */
public interface  Observable {

     void addObserver( Observer observer);

     void removeObserver( Observer observer);

     void notifyAllObservers( Observer observer);

}
