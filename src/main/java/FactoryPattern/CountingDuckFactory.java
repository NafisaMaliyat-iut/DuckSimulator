package FactoryPattern;

import DecoratorPattern.QuackCounter;
import Ducks.AbstractDuck;
import Ducks.MallardDuck;
import Ducks.RedheadedDuck;
import Ducks.RubberDuck;

public class CountingDuckFactory implements AbstractDuckFactory {
   @Override
   public AbstractDuck createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public AbstractDuck createRedHeadedDuck() {
        return new QuackCounter(new RedheadedDuck());
    }

    @Override
    public AbstractDuck createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
