package CommandPattern;

public class TvRemote {

    public static Device getDevice(){
        return new Television();
    }

}
