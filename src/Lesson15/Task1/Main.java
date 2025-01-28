package Lesson15.Task1;

public class Main {
    public static void main(String[] args) {

        AppConfig appConfig=AppConfig.getInstance();
        appConfig.displaySettings();

        appConfig.setSettings("Alman dili");
        appConfig.displaySettings();

    }
}
