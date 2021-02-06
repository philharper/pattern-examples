package co.uk.philharper.patternexamples.strategypattern.barks;

public class YapBark implements BarkMechanism {

    @Override
    public void bark() {
        System.out.println("Yap yap");
    }
}
