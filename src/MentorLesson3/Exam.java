package MentorLesson3;

import java.util.UUID;

public class Exam {

    private final String examID;

    private String subject;
    private int marks;

    public Exam(String subject, int marks) {
        this.examID = UUID.randomUUID().toString();
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
