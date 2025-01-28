package MentorLesson2;

import java.util.Random;
import java.util.UUID;

public class Teacher {
    private String name;
    private int age;
    private static int totalTeachers;
    private final String id;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID().toString();;
        totalTeachers++;
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

    public String getId() {
        return id;
    }

    public static int getTotalTeachers() {
        return totalTeachers;
    }

    public void teach(){
        System.out.println("Teacher is Messi");
    }














}
