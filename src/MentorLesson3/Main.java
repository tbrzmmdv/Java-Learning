package MentorLesson3;

public class Main {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("Tebriz",2,2);
        students[1]=new Student("Tural",2,2);
        students[2]=new Student("Eli",2,2);
        Exam math=new Exam("Math",100);
        Exam sport=new Exam("Sport",100);
        students[0].addGrade(0,0,90);
        students[0].addGrade(0,1,99);
        students[0].addGrade(1,0,80);
        students[0].addGrade(1,1,19);
        students[1].addGrade(0,0,70);
        students[1].addGrade(0,1,69);
        students[1].addGrade(1,0,50);
        students[1].addGrade(1,1,49);
        students[2].addGrade(0,0,20);
        students[2].addGrade(0,1,39);
        students[2].addGrade(1,0,55);
        students[2].addGrade(1,1,43);


        for (Student student:students){
            System.out.println("Student ID:"+ student.getStudentID());
            System.out.println("Name:"+ student.getName());
            System.out.println("Average Grade:"+ student.calculateAverageGrade());
            System.out.println();
        }

        System.out.println("Students: " + Student.getTotalStudents());
    }
}
