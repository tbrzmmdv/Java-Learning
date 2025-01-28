package Lesson12;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int age, int salary, String position, String programmingLanguage) {
        super(name, age, salary, position);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo(){
        System.out.println("name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", position='" + getPosition() + '\'' +
                ", programmingLanguage=" + programmingLanguage +
                '}');
    }

    public double calculateBonus(double percentage,double fixedAmount){
        fixedAmount=800;
        percentage=percentage/100;
        return getSalary()*percentage+fixedAmount;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
