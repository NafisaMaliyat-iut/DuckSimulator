package Ducks;

import ObserverPattern.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
