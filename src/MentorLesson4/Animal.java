package MentorLesson4;

public class Animal {
    private String name;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println("Animal Sound");
    }


    public void displayInfo(){
        System.out.println("Animal name:"+name);
    }


}
