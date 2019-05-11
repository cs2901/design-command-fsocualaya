package command;

public class NewRemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light kitchenLight = new Light();
        Light livingLight = new Light();
        Door garageDoor = new Door();
        CeilingFan ceilingFan = new CeilingFan();

        System.out.println("Kitchen Light:");
        KitchenLightOnCommand kitchenLightOn = new KitchenLightOnCommand(kitchenLight);
        remote.setCommand(kitchenLightOn);
        remote.buttonWasPressed();

        System.out.println("Living Light:");
        LivingLightOffCommand livingLightOff= new LivingLightOffCommand(livingLight);
        remote.setCommand(livingLightOff);
        remote.buttonWasPressed();

        System.out.println("Door:");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorCloseCommand);
        remote.buttonWasPressed();

        System.out.println("Ceiling Fan:");
        FanHighCommand fanHighCommand = new FanHighCommand(ceilingFan);
        remote.setCommand(fanHighCommand);
        remote.buttonWasPressed();
    }
}
