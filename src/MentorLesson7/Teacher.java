package MentorLesson7;

public class Teacher extends LibraryUser{
    public Teacher(String name, int userId) {
        super(name, userId);
    }

    @Override
    int getMaxBooksAllowed() {
        return 10;
    }
}
