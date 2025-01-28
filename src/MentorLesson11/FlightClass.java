package MentorLesson11;

public enum FlightClass {
    ECONOMY(1),PREMIUM_ECONOMY(1.5),BUSINESS(2),FIRST_CLASS(3);
    public final double price;

    FlightClass(double price) {
        this.price = price;
    }

}
