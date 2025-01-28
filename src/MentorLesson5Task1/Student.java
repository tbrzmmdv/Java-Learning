package MentorLesson5Task1;

public class Student extends Person{
    private int grade;

    public Student(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo(){
        System.out.println("Student Name is "+getName()+" and ID is "+getId()+" and grade is "+getGrade());
    }

    public void study(){
        System.out.println(getName()+" is currently studying.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
