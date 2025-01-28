package Lesson12;

public class Main {
    public static void main(String[] args) {
        Employee[] employees=new Employee[4];
        employees[0]=new Manager("Tebriz",18,1000,"Manager",5);
        employees[1]=new Manager("Elvin",20,1000,"Manager",3);
        employees[2]=new Developer("Qedim",30,800,"Developer","Java");
        employees[3]=new Developer("Tamerlan",40,800,"Developer","Python");

        for (Employee e:employees){
            e.displayInfo();
            System.out.println(e.calculateBonus(5,1000));
        }
    }
}
