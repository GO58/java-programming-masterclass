
public class Appliance {
    private boolean isWorking;

    public Appliance() {
        this(false);
    }

    public Appliance(boolean isWorking) {
        this.isWorking = isWorking;
    }

    protected boolean isWorking(){
        return isWorking;
    }

    protected void turnOn(){
        isWorking = true;
    }

    protected void turnOff(){
        isWorking = false;
    }
}
