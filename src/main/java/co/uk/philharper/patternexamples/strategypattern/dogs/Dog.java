package co.uk.philharper.patternexamples.strategypattern.dogs;

import co.uk.philharper.patternexamples.strategypattern.barks.BarkMechanism;

public abstract class Dog {

    BarkMechanism barkMechanism;
    String colour;

    void setBarkMechanism(BarkMechanism barkMechanism) {
        this.barkMechanism = barkMechanism;
    }

    void bark() {
        barkMechanism.bark();
    }

}
