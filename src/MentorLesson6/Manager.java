package MentorLesson6;

public class Manager extends Employee implements Workable{


//    public Manager(String name, int salary) {
//        super(name, salary);
//    }

    @Override
    void getSalary() {
        int fixedBonus=200;
        System.out.println(salary+fixedBonus);
    }

    @Override
    public void work() {
        System.out.println("Manager should manage the team");

    }
}
