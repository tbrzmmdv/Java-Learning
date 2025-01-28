package Lesson12;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String position;

    public Employee(String name, int age, int salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    public double calculateBonus(double percentage){
        percentage=percentage/100;
        return salary*percentage;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public void displayInfo(){
        System.out.println("name='" + name + '\'' +
                           ", age=" + age +
                           ", salary=" + salary +
                           ", position='" + position + '\'' +
                '}');
    }





    public double calculateBonus(double percentage,double fixedAmount){
        fixedAmount=800;
        percentage=percentage/100;
        return getSalary()*percentage+fixedAmount;



















}}
