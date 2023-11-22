package Ducks;

public class MallardDuck extends Duck {

    @Override
    public String toString() {
        return "Mallard Duck";
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck is quacking");
        super.notifyObservers();
    }
}
