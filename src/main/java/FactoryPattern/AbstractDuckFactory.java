package FactoryPattern;

import Ducks.AbstractDuck;

public interface AbstractDuckFactory {
    public AbstractDuck createMallardDuck();
    public AbstractDuck createRedHeadedDuck();
    public AbstractDuck createRubberDuck();
}
