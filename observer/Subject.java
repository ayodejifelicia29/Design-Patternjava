package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private Order order;

    public void setOrder(Order order, Class<?> oclass) {
        this.order = order;
        notifyAllObservers(oclass);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }

    public void notifyAllObservers(Class<?> oclass) {
        for (Observer observer : observers) {
            if (observer.getClass() == oclass) {
                observer.update(order);
            }
        }
    }
}
