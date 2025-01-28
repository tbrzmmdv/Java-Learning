package MentorLesson8;

public abstract class Vehicle {
    public String id;
    public String name;

    public Vehicle(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String showDetails();  //return id and name
}
