package MentorLesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {


        private String name;

        private String email;

        private String phone;

        private int grades;


    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", grades=" + grades +
                '}';
    }

    public Student(String name, String email, String phone, int grades) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.grades = grades;
    }

    //    public void setGrades(int grades) {
//        this.grades = grades;



//        StringBuilder studentDetails=new StringBuilder();
//
//        studentDetails.append("Telebenin bilgileri:\n");
//        studentDetails.append("Ad:").append(name).append("\n");
//        studentDetails.append("E-mail:").append(email).append("\n");
//        studentDetails.append("Telefon:").append(phone).append("\n");
//        studentDetails.append("Ballar:").append(grades).append("\n");
//
//
//        allStudents.add(studentDetails.toString().trim());




}
