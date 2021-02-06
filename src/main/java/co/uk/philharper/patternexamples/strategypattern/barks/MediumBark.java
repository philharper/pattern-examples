package co.uk.philharper.patternexamples.strategypattern.barks;

public class MediumBark implements BarkMechanism {

    @Override
    public void bark() {
        System.out.println("Loud woof");
    }
}
