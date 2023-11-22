package DecoratorPattern;

import Ducks.Duck;

// QuackCounter decorator
public class QuackCounter extends Duck {
    private Duck duck;
    private static int quackCount = 0;

    public QuackCounter(Duck duck) {
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
