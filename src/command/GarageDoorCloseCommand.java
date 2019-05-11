package command;

public class GarageDoorCloseCommand implements Command{
    Door garageDoor;
    public GarageDoorCloseCommand(Door garageDoor){this.garageDoor = garageDoor;}
    public void execute(){garageDoor.close();}
}
