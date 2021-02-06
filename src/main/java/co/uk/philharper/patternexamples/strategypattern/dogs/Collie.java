package co.uk.philharper.patternexamples.strategypattern.dogs;

import co.uk.philharper.patternexamples.strategypattern.barks.MediumBark;

public class Collie extends Dog  {

    public Collie() {
        barkMechanism = new MediumBark();
        colour = "Black/White";
    }

}
