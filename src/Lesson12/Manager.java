package Lesson12;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int age, int salary, String position, int teamSize) {
        super(name, age, salary, position);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }

    @Override
    public void displayInfo(){
        System.out.println("name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", position='" + getPosition() + '\'' +
                ", teamSize=" + teamSize +
                '}');
    }

    public double calculateBonus(double percentage,double fixedAmount){
        fixedAmount=1000;
        percentage=percentage/100;
        return getSalary()*percentage+fixedAmount;

    }

}
