package MentorLesson2;

import java.util.Random;
import java.util.UUID;

public class Student {

    private String name;
    private int grade;
    private static int totalStudent;
    private final String id;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = UUID.randomUUID().toString();
        totalStudent++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setAge(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public String study(){
//        System.out.println("Student is Yamal");
        return "student study";
    }

}
