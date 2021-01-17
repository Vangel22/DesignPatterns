package Command;

public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        //Same logic as TurnTVOn and TurnTVOff

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumenDown();

    }

}
