package ObserverPattern;

public class StockObserver implements  Observer {

    private double ibmPrice;
    private double aapPrice;
    private double googPrice;
    private static int obserIDTracker = 0;

    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++obserIDTracker;
        System.out.println("new Observer " + this.observerID);
        stockGrabber.register(this);

    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
       this.ibmPrice = ibmPrice;
       this.aapPrice = aaplPrice;
       this.googPrice = googPrice;

       printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nIBM:" + ibmPrice +
                "\nAAPL:" + aapPrice + "\nGOOG: " + googPrice);
    }
}
