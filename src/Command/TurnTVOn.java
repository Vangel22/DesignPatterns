package Command;

public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        //Logic: i have interface that has a method on() and than my object
        //is passed as value theDevice.on() when execute() method is called in Command interface

        theDevice.on(); //command object

        //Command object;
        //object.execute(); -> turns tv on -> this will be used in the INVOKER

    }

    public void undo() {

        theDevice.off();

    }

}
