import AdapterPattern.Goose;
import AdapterPattern.GooseAdapter;
import CompositePattern.Flock;
import DecoratorPattern.QuackCounter;
import Ducks.Duck;
import FactoryPattern.AbstractDuckFactory;
import FactoryPattern.CountingDuckFactory;
import ObserverPattern.IndividualDuckObserver;
public class DuckSimulator {
    void simulate(AbstractDuckFactory duckFactory){
        System.out.println("\nDemonstrating quack of birds");
        Duck redHeadedDuck = duckFactory.createRedHeadedDuck();
        Duck mallardDuck = duckFactory.createMallardDuck();
        Duck goose = new GooseAdapter(new Goose());
        demonstrate(redHeadedDuck);
        demonstrate(mallardDuck);
        demonstrate(goose);

        System.out.println("\nDemonstrating quack of a flock:");
        Flock flockOfDucks = new Flock();
        flockOfDucks.addDuck(duckFactory.createMallardDuck());
        flockOfDucks.addDuck(duckFactory.createRedHeadedDuck());
        flockOfDucks.addDuck(new GooseAdapter(new Goose()));
        demonstrate(flockOfDucks);

        System.out.println("\nDemonstrating quack counter:");
        // expected: 4 since goose quacks are not counted
        System.out.println("The ducks have quacked " + QuackCounter.getQuackCount() + " times.");


        IndividualDuckObserver observer = new IndividualDuckObserver();
        System.out.println("\nDemonstrating observer for flock");
        flockOfDucks.registerObserver(observer);
        demonstrate(flockOfDucks);

        System.out.println("\nRemoving observer for flock");
        flockOfDucks.removeObserver(observer);
        demonstrate(flockOfDucks);

        System.out.println("\nDemonstrating observer for individual birds");
        redHeadedDuck.registerObserver(observer);
        mallardDuck.registerObserver(observer);
        goose.registerObserver(observer);
        demonstrate(redHeadedDuck);
        demonstrate(mallardDuck);
        demonstrate(goose);

    }

    void demonstrate(Duck duck){
        duck.quack();
    }

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        //select whether ducks have quack count
        AbstractDuckFactory factory = new CountingDuckFactory();
        duckSimulator.simulate(factory);
    }
}
