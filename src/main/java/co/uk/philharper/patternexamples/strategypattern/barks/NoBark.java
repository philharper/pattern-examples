package co.uk.philharper.patternexamples.strategypattern.barks;

public class NoBark implements BarkMechanism {

    @Override
    public void bark() {
        System.out.println("No woof");
    }
}
