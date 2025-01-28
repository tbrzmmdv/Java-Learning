package Lesson15.Task3;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name+" "+news);

    }
}
