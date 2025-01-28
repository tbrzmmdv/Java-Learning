package MentorLesson5Task1;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void displayInfo(){
        System.out.println("Teacher Name is "+getName()+" and ID is "+getId()+" and subject is "+getSubject());
    }

    public void teach(){
        System.out.println(getName()+" now teaching");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
