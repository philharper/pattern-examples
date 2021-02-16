package co.uk.philharper.patternexamples.observerpattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LondonStockExchange implements Observer, Output  {

    private Map<String, Double> prices;
    private List<Subject> priceSubjects;

    public LondonStockExchange(List<Subject> priceSubjects) {
        this.priceSubjects = priceSubjects;
        this.prices = new HashMap<>();
        priceSubjects.forEach(subject -> subject.registerObserver(this));
    }

    @Override
    public void update(String code, double price) {
        this.prices.put(code, price);
        outputUpdatedPrice(code);
    }

    @Override
    public void outputUpdatedPrice(String code) {
        prices.forEach((name, price) -> {
            if (name.equals(code)) {
                System.out.println(String.format("Current %s stock price: %s", name, price));
            }
        });
    }
}
