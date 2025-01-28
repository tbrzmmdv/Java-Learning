package MentorLesson9;


public class Main {
    public static void main(String[] args) {
        AppConfig instance=AppConfig.getInstance();
        System.out.println(instance.getLanguage());

        
        AppConfig appSetting2 = AppConfig.getInstance();
        appSetting2.setLanguage("Russian");
        System.out.println(appSetting2.getLanguage());
        System.out.println(appSetting2);
    }
}
