package CommandPattern;

public class TurnTVUp implements  Command {
    Device device;

    public TurnTVUp(Device device){
        this.device = device;
    }


    @Override
    public void execute() {
        device.volumeUp();
    }
}
