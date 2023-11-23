package AdapterPattern;

import Ducks.AbstractDuck;

public class GooseAdapter extends AbstractDuck {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
        super.notifyObservers();
    }

    @Override
    public String toString() {
        return "Goose in Disguise";
    }
}
