package BridgePattern;

public class TvRemoteJava extends RemoteBtn {
    public TvRemoteJava(EntertainmentDevice newDevice){
        super(newDevice);

    }
    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");

    }
}
