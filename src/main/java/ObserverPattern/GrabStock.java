package ObserverPattern;

/**
 * The observer design is a software design pattern in which an object
 * called the subject, maintains a list of its dependents, called observers, and notifies them
 * automatically of any state changes, usually by calling one of their methods.
 *
 *  >>The subject(publisher) doesn't need to know anything about the observers(subscribers)
 * >>>>Negatives: The subject(publisher) may send updates that don't matter to the observer(subscriber);\
 */
public class GrabStock {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer = new StockObserver(stockGrabber);

        Runnable getIBM = new GrabTheStock(stockGrabber,2,"IBM",197.00);
        Runnable getAAPL = new GrabTheStock(stockGrabber,2,"AAPL",677.60);
        Runnable getGOOG = new GrabTheStock(stockGrabber,2,"GOOG",676.40);

        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
        new Thread(getIBM).start();

    }
}
