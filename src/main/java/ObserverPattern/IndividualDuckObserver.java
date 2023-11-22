package ObserverPattern;

public class IndividualDuckObserver implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Individual Observer observed that " + duck + " has quacked!");
    }
}
