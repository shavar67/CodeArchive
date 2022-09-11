package CommandPattern;

public class DeviceBtn {

    Command theCommand;

    public DeviceBtn(Command newCommand){
        theCommand = newCommand;
    }
    public void press(){
        theCommand.execute();
    }
}
