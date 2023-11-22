package AdapterPattern;

import Ducks.Duck;

public class GooseAdapter extends Duck {
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
