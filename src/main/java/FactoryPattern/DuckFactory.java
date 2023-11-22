package FactoryPattern;

import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.RedheadedDuck;

public class DuckFactory implements AbstractDuckFactory {

    public Duck createMallardDuck() {
        return new MallardDuck();
    }

    public Duck createRedHeadedDuck() {
        return new RedheadedDuck();
    }
}
