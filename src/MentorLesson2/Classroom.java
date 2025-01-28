package MentorLesson2;

public class Classroom {
    public static void main(String[] args) {
        Teacher[] teachers=new Teacher[2];
        Student[] students=new Student[2];
        teachers[0]=new Teacher("Tebriz",18);
        teachers[1]=new Teacher("Eli",20);
        students[0]=new Student("Ali",27);
        students[1]=new Student("Memmed",32);
        System.out.println(students[0].study());
    }
}
