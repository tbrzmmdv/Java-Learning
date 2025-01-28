package Lesson11;

public class Student {
    private String name;
    private Integer grade;

    int age;





    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getGrade()
    {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>=0 && grade<=100){
             this.grade = grade;
        }
        else {
            System.out.println("Grade should be between 0 and 100.If Grade:null please edit your grade.");

        }
    }

    public static void main(String[] args) {

        Student student1=new Student();
        student1.setName("Tebriz");
        student1.setGrade(10);
        System.out.println("Student:"+ student1.getName());
        System.out.println("Grade:"+ student1.getGrade());

    }
}
