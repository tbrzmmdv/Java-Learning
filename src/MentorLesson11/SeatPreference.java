package MentorLesson11;

public enum SeatPreference {
    WINDOW(50),AISLE(25),MIDDLE(0);

    public final int price;

    SeatPreference(int price) {
        this.price = price;
    }
}
