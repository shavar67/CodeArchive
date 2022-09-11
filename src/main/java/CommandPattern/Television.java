package CommandPattern;

public class Television implements Device {

   private int volume = 0;

    @Override
    public void on() {
        System.out.println("tv is on");
    }

    @Override
    public void off() {
        System.out.println("tv is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Tv volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Tv volume is at " + volume);

    }
}
