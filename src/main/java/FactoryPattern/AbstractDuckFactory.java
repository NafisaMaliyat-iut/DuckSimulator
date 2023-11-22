package FactoryPattern;

import Ducks.Duck;

public interface AbstractDuckFactory {
    public Duck createMallardDuck();
    public Duck createRedHeadedDuck();
}
