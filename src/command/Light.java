package command;

public class Light {
    private boolean isOn = false;
    public void on(){
        isOn = true;
        System.out.println("Light is On:"+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Light is On:"+isOn);
    }

}
