package command;

public class FanLowCommand implements Command{
    CeilingFan ceilingFan;
    public FanLowCommand(CeilingFan ceilingFan){this.ceilingFan = ceilingFan;}
    public void execute(){ceilingFan.low();};
}
