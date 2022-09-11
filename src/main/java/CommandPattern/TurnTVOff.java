package CommandPattern;

public class TurnTVOff implements Command {
    Device device;

    public TurnTVOff(Device device){
        this.device = device;
    }


    @Override
    public void execute() {
        device.off();
    }
}
