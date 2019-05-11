package command;

public class KitchenLightOffCommand implements Command{
    Light kitchenLight;
    public KitchenLightOffCommand(Light kitchenLight){
        this.kitchenLight = kitchenLight;
    }
    public void execute(){
        kitchenLight.off();
    }
}
