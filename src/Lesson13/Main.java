package Lesson13;

public class Main {
    public static void main(String[] args) {
        SmartFridge smartFridge=new SmartFridge();
        SmartWashingMachine smartWashingMachine=new SmartWashingMachine();
        smartFridge.turnOn();
        smartWashingMachine.turnOn();
        smartFridge.connectToWifi();
        smartWashingMachine.connectToWifi();
        smartFridge.showBrand("CoolTech Appliances");
        smartWashingMachine.showBrand("CleanTech Solutions");
    }
}
