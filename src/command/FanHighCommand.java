package command;

public class FanHighCommand implements Command{
    CeilingFan ceilingFan;
    public FanHighCommand(CeilingFan ceilingFan){this.ceilingFan = ceilingFan;}
    public void execute(){ceilingFan.high();};
}
