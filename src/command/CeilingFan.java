package command;

public class CeilingFan {
    private boolean isLow = false;
    public void low(){
        isLow  = true;
        System.out.println("Is low:"+isLow);
    }
    public void high(){
        isLow  = false;
        System.out.println("Is low:"+isLow);
    }
}
