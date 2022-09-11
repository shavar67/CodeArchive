package ObserverPattern;

import java.text.DecimalFormat;

public class GrabTheStock implements Runnable{
  private int startTime;
  private String stock;
  private double price;

  private Subject stockGrab;
  public GrabTheStock(Subject stockGrab, int startTime,String newStock, double newPrice){
       this.stockGrab = stockGrab;
       this.startTime = startTime;
       stock = newStock;
       price = newPrice;


  }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(startTime * 2000);
            } catch (InterruptedException e) {
            }
            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price + randNum));

            switch (stock) {

                case "IBM":
                    ((StockGrabber) stockGrab).setIBMPrice(price);
                    System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
                    System.out.println();
                    break;
                case "AAPL":
                    ((StockGrabber) stockGrab).setAAPPrice(price);
                    System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
                    System.out.println();
                    break;
                case "GOOG":
                    ((StockGrabber) stockGrab).setGoogPrice(price);
                    System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
                    System.out.println();
                    break;


            }
        }
    }

}






