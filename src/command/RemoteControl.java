package command;

public class RemoteControl{
    Command slot;

    public void RemoteControl(){}
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
