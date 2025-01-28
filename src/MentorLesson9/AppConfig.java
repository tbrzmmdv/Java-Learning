package MentorLesson9;

public class AppConfig {

    private static AppConfig instance;

    private String language="english";

    public AppConfig() {
        this.language =getLanguage();
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public static AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }}

