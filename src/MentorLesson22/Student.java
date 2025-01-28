package MentorLesson22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Student implements Comparable<Student>{


    String name;
    int age;

    String surname;

    public Student(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }



    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Student student=new Student("Tebriz",12,"Messi");
//        Student student1=new Student("Aga",12,"Messi");
//        Student student2=new Student("Mukala",12,"Messi");
//        Student student3=new Student("Lumpur",12,"Messi");
//
//        List<Student> students=new ArrayList<>();
//        students.add(student);
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//
//        System.out.println(students);
//
//
//        Collections.sort(students);
//
//        System.out.println(students);

        List<Integer> numberList = List.of(5, 10, 3, 7, 20, 15);

        List<Integer> sortedNumbers = numberList.stream()
                .sorted((n1, n2) -> n2 - n1) // Reverse order
                .collect(Collectors.toList());

        System.out.println("Sorted numbers in reverse order: " + sortedNumbers);

    }
}
