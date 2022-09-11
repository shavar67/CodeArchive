package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    //store observers in an arraylist

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

   public StockGrabber(){
      observers = new ArrayList<>();

  }
    @Override
    public void register(Observer newObserver) {

      observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {

      int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted" );
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIBMPrice(double newIBMPrice){
      this.ibmPrice = newIBMPrice;
      notifyObserver();
    }
    public void setAAPPrice(double newAAPprice){
        this.aaplPrice = newAAPprice;
        notifyObserver();
    }
    public void setGoogPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
