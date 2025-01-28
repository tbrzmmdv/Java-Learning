package MentorLesson7;

public class Student extends LibraryUser{


    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    int getMaxBooksAllowed() {
        return 3;
    }

}
