package Ducks;

public class RubberDuck extends AbstractDuck{
    @Override
    public String toString() {
        return "Rubber Duck";
    }

    @Override
    public void quack() {
        System.out.println("Rubber duck is quacking");
        super.notifyObservers();
    }
}
