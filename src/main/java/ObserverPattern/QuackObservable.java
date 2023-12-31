package ObserverPattern;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

