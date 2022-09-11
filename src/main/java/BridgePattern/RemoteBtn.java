package BridgePattern;

public abstract  class RemoteBtn {

    private EntertainmentDevice theDevice;

    public RemoteBtn(EntertainmentDevice newDevice){
        theDevice = newDevice;

    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }
    public void buttonSixPressed(){
        theDevice.buttonSixressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
