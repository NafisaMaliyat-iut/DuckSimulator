package CompositePattern;

import Ducks.AbstractDuck;
import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock extends AbstractDuck {
    private List<AbstractDuck> ducks = new ArrayList<>();

    public void addDuck(AbstractDuck duck) {
        ducks.add(duck);
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<AbstractDuck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().registerObserver(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        Iterator<AbstractDuck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().removeObserver(observer);
        }
    }

    @Override
    public void quack() {
        System.out.println("Flock is quacking: ");
        Iterator<AbstractDuck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<AbstractDuck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString() + "\n") ;
        }
        return stringBuilder.toString();
    }
}
