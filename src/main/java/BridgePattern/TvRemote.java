package BridgePattern;

public class TvRemote extends RemoteBtn {


    public TvRemote(EntertainmentDevice newDevice){
        super(newDevice);

    }
    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");

    }
}
