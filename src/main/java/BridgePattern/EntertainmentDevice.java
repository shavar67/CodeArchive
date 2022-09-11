package BridgePattern;

public abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeSetting = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixressed();

    public void deviceFeedback() {
        if (deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
            System.out.println("On " + deviceState);
        }
    }

    public void buttonSevenPressed() {
        volumeSetting++;
        System.out.println("Volume at: " + volumeSetting);
    }

    public void buttonEightPressed() {
        volumeSetting--;
        System.out.println("Volume at: " + volumeSetting);
    }
}

