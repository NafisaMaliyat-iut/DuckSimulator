package ObserverPattern;

import Ducks.Duck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//helper class of observable
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(Duck duck){
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(duck);
        }
    }
}
