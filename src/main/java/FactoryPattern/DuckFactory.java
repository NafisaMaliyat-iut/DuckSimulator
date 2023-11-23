package FactoryPattern;

import Ducks.AbstractDuck;
import Ducks.MallardDuck;
import Ducks.RedheadedDuck;
import Ducks.RubberDuck;

public class DuckFactory implements AbstractDuckFactory {

    @Override
    public AbstractDuck createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public AbstractDuck createRedHeadedDuck() {
        return new RedheadedDuck();
    }

    @Override
    public AbstractDuck createRubberDuck() {
        return new RubberDuck();
    }
}
