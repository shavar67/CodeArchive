package CommandPattern;

public class PlayWithRemote {

    public static void main(String[] args) {

        Device newDevice =TvRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceBtn onPressed = new DeviceBtn(onCommand);
        onPressed.press();

        //----------------->
        Device Device =TvRemote.getDevice();
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceBtn(offCommand);
        onPressed.press();

       //------------------>
        TurnTVUp volup = new TurnTVUp(newDevice);
        onPressed = new DeviceBtn(volup);
        onPressed.press();
    }
}
