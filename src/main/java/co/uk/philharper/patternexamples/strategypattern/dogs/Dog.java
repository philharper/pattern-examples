package co.uk.philharper.patternexamples.strategypattern.dogs;

import co.uk.philharper.patternexamples.strategypattern.barks.BarkMechanism;

public abstract class Dog {

    BarkMechanism barkMechanism;
    String colour;

    void bark() {
        barkMechanism.bark();
    }

}
