package Command;

public class TVRemote {

    //this method is static because it will be called in PlayWithRemote( Main class)
    public static ElectronicDevice getDevice(){

        return new Television();

    }

}
