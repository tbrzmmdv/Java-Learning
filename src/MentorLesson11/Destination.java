package MentorLesson11;

public enum Destination {
    NEW_YORK(500),LONDON(600),TOKYO(700),PARIS(550),SYDNEY(1000);
    public final int price;

    Destination(int price) {
        this.price = price;
    }
}
