package command;

public class GarageDoorOpenCommand implements Command{
    Door garageDoor;
    public GarageDoorOpenCommand(Door garageDoor){this.garageDoor = garageDoor;}
    public void execute(){garageDoor.open();}
}
