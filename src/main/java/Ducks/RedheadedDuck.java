package Ducks;

public class RedheadedDuck extends AbstractDuck {

    @Override
    public String toString() {
        return "Red-Headed Duck";
    }

    @Override
    public void quack() {
        System.out.println("Red-headed duck is quacking");
        super.notifyObservers();
    }
}
