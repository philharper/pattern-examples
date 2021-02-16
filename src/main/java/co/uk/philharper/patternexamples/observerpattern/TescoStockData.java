package co.uk.philharper.patternexamples.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class TescoStockData implements Subject {

    private List<Observer> observers;
    private double price;

    public TescoStockData() {
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
            observer.update("TSCO", price);
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
