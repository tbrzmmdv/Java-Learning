package MentorLesson6;

public class Developer extends Employee implements Workable{



    @Override
    void getSalary() {
        int fixedsalary=200;
        System.out.println(fixedsalary);
    }

    @Override
    public void work() {
        System.out.println("Developer writing a code");
    }
}
