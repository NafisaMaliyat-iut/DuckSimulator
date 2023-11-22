package CompositePattern;

import Ducks.Duck;
import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock extends Duck{
    private List<Duck> ducks = new ArrayList<>();

    public void addDuck(Duck duck) {
        ducks.add(duck);
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Duck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().registerObserver(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        Iterator<Duck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().removeObserver(observer);
        }
    }

    @Override
    public void quack() {
        System.out.println("Flock is quacking: ");
        Iterator<Duck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Duck> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString() + "\n") ;
        }
        return stringBuilder.toString();
    }
}
