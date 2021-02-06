package co.uk.philharper.patternexamples.strategypattern.dogs;

import co.uk.philharper.patternexamples.strategypattern.barks.NoBark;

public class Toy extends Dog {

    public Toy() {
        barkMechanism = new NoBark();
        colour = "Brown";
    }

}
