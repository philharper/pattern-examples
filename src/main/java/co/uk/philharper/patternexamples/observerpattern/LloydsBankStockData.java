package co.uk.philharper.patternexamples.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class LloydsBankStockData implements Subject {

    private List<Observer> observers;
    private double price;

    public LloydsBankStockData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("LLOY", price);
        }
    }

    public void priceChanged() {
        notifyObservers();
    }

    public void setPrice(double price) {
        this.price = price;
        priceChanged();
    }
}
