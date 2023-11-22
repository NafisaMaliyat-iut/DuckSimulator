package Ducks;

import ObserverPattern.Observable;
import ObserverPattern.Observer;

public abstract class Duck implements Quackable {
    Observable observable;

    public Duck(){
        this.observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void removeObserver(Observer observer){
        observable.removeObserver(observer);
    }

    @Override
    public abstract String toString();
}
