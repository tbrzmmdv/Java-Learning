package MentorLesson2;

import java.util.UUID;

public class Population {
    private final String id;
    private String name;
    private int age;

    private static int population;

    public Population(String name, int age) {
        this.id =UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        population++;
    }

    public String getId() {
        return id;
    }

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
        return "Population{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String introduce(){
        return "Population{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }







}
