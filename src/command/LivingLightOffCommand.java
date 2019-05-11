package command;

public class LivingLightOffCommand implements Command{
    Light livingLight;
    public LivingLightOffCommand(Light livingLight){this.livingLight=  livingLight;}
    public void execute() {livingLight.off();}
}
