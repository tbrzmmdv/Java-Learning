package MentorLesson7;

public abstract class LibraryUser {
    String name;
    int userId;

    public LibraryUser(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    abstract int getMaxBooksAllowed();

    String userDetails(){
        return "Name:"+name+" Id:"+userId;
    }
}
