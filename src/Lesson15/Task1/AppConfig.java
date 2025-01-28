package Lesson15.Task1;

public class AppConfig {
    private static AppConfig instance;

    private String settings;


    private AppConfig(){
        this.settings="Azerbaycan dili";

    }


    public static AppConfig getInstance(){
        if (instance==null){
            instance= new AppConfig();
        }
        return instance;
    }

    public void displaySettings(){
        System.out.println("Settings is:"+settings);
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }






}
