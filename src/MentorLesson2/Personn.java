package MentorLesson2;

public class Personn {
    private String name;
    private int age;

    public String region;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", region='" + region + '\'' +
                '}';

    }





}
