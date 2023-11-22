package FactoryPattern;

import DecoratorPattern.QuackCounter;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.RedheadedDuck;

public class CountingDuckFactory implements AbstractDuckFactory {
    public Duck createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Duck createRedHeadedDuck() {
        return new QuackCounter(new RedheadedDuck());
    }

}
