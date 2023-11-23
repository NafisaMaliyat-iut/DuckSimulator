package DecoratorPattern;

import Ducks.AbstractDuck;

// QuackCounter decorator
public class QuackCounter extends AbstractDuck {
    private AbstractDuck duck;
    private static int quackCount = 0;

    public QuackCounter(AbstractDuck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
        super.notifyObservers();
    }

    public static int getQuackCount() {
        return quackCount;
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
