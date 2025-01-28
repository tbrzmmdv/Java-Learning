package MentorLesson3;

import java.util.UUID;

public class Student {

    private final String studentID= UUID.randomUUID().toString();
    private String name;
    int[][] grades;
    static int totalStudents;

    public Student(String name,int subjects,int grades) {

        this.name = name;
        this.grades =new int[subjects][grades];
        totalStudents++;
    }



    public void addGrade(int subjectIndex,int assessmentIndex,int grade){
        grades[subjectIndex][assessmentIndex]=grade;
    }
    public int calculateAverageGrade(){
        int sum=0;
        int gradeCounter=0;
        for (int i=0;i< grades.length;i ++){
            for (int j=0;j< grades[i].length;j++){
                sum+=grades[i][j];
                gradeCounter++;

            }
        }

        return sum/gradeCounter;
    }


    public static int getTotalStudents(){
        return totalStudents;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




