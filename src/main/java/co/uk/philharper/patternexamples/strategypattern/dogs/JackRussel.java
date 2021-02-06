package co.uk.philharper.patternexamples.strategypattern.dogs;

import co.uk.philharper.patternexamples.strategypattern.barks.YapBark;

public class JackRussel extends Dog  {

    public JackRussel() {
        barkMechanism = new YapBark();
        colour = "White";
    }

}
