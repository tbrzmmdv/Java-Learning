package MentorLesson7;

public class Main2 {
    public static void main(String[] args) {
        LibraryUser[] user=new LibraryUser[3];
        user[0]=new Student("Tebriz",10);
        user[1]=new Student("Tural",15);
        user[2]=new Teacher("Seide",22);
        for (LibraryUser users:user){
            System.out.println(users.userDetails());
            System.out.println(users.getMaxBooksAllowed());
        }

    }
}
