package Lesson13;

public class SmartWashingMachine extends Appliance implements SmartFeature{
    @Override
    public void turnOn() {
        System.out.println("SmartWashingMachine is now ON");
    }

    @Override
    public void connectToWifi() {
        System.out.println("SmartWashingMachine connected to Wi-Fi:WasherNet.");

    }
}
