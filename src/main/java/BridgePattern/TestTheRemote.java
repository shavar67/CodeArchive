package BridgePattern;

public class TestTheRemote {

    public static void main(String[] args) {

        RemoteBtn theTv = new TvRemote(new TvDevice(1,200));
        RemoteBtn theTv2 = new TvRemoteJava(new TvDevice(1,200));

        System.out.println("Test tv with Mute");
        theTv.buttonFivePressed();
        theTv.buttonSixPressed();
        theTv.buttonNinePressed();

        System.out.println("\nTest tv with Pause");
        theTv2.buttonFivePressed();
        theTv2.buttonSixPressed();
        theTv2.buttonNinePressed();
        theTv2.deviceFeedback();
    }
}
