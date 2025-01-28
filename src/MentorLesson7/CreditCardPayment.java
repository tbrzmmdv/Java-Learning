package MentorLesson7;

public class CreditCardPayment implements PaymentProcessor{

    public CreditCardPayment(String  cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    String  cardNumber;
    String cardHolderName;

    @Override
    public void processorPayment(double amount) {

    }

    @Override
    public String getPaymentDetails() {
        return null;
    }
}
