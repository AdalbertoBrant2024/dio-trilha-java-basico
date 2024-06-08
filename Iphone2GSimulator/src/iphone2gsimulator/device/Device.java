package iphone2gsimulator.device;

public abstract class Device {
    private boolean isOn = false;
    
    public void powerOn(){
        this.isOn = true;
        System.out.println("Starting...");
    }
    public void powerOFF(){
        if (isOn){
            System.out.println("Device is powered off.");
            isOn = false;
        }
    }

}
