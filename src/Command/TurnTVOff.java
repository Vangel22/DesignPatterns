package Command;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        //Same logic as in TurnTVOn

        theDevice.off(); //this is a command object

        //Command object;
        //object.execute(); -> turns tv off -> this will be used in the INVOKER

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    public void undo() {

        theDevice.on();

    }

}
