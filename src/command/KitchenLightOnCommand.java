package command;

public class KitchenLightOnCommand implements Command{
    Light kitchenLight;
    public KitchenLightOnCommand(Light kitchenLight){
        this.kitchenLight = kitchenLight;
    }
    public void execute(){
        kitchenLight.on();
    }
}
