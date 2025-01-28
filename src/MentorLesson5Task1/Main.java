package MentorLesson5Task1;

public class Main {
    public static void main(String[] args) {
        School school=new School();
        school.teachers=new Teacher[2];
        Teacher[] teachers=school.teachers;
        teachers[0]=new Teacher("Tebriz","Teacher01","Sport");
        teachers[1]=new Teacher("Tural","Teacher02","Math");

        school.students=new Student[2];
        Student[] students= school.students;
        students[0]=new Student("Ali","Student01",50);
        students[1]=new Student("Qedim","Student02",60);


        school.addStudents();
        school.addTeachers();
        school.displayAllPeople();
        students[0].study();
        teachers[0].teach();


    }
}
