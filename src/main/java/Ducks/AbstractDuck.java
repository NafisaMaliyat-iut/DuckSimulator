package Ducks;

import ObserverPattern.Observable;
import ObserverPattern.Observer;

public abstract class AbstractDuck implements Quackable {
    private Observable observable;
    public AbstractDuck(){
        this.observable = new Observable(this);
    }

    //Delegating to Helper Observable Class
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
