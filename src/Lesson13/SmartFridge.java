package Lesson13;

public class SmartFridge extends Appliance implements SmartFeature{
    @Override
    public void turnOn() {
        System.out.println("SmartFridge is now ON");
    }

    @Override
    public void connectToWifi() {
        System.out.println("SmartFridge connected to Wi-Fi:FridgeNet");

    }
}
