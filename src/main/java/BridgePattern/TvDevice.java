package BridgePattern;

public class TvDevice extends EntertainmentDevice {


    public TvDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }
    @Override
    public void buttonFivePressed() {

        System.out.println("Channel down");
        deviceState--;
    }

    @Override
    public void buttonSixressed() {
        System.out.println("Channel up");
        deviceState++;
    }
}
