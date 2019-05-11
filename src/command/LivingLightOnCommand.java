package command;

public class LivingLightOnCommand implements Command{
    Light livingLight;
    public LivingLightOnCommand(Light livingLight){ this.livingLight=  livingLight;}
    public void execute() {livingLight.on();}
}
