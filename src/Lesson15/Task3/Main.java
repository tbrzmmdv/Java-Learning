package Lesson15.Task3;

public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new Subscriber("Tural");
        Subscriber subscriber2 = new Subscriber("Qedim");
        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);
        newsAgency.setLatestNews("Messi Azerbaycana gelir");

    }
}

