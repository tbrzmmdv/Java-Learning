package MentorLesson7;

public class MobileWalletPayment implements PaymentProcessor{
    public MobileWalletPayment(int walletId, int phoneNumber) {
        this.walletId = walletId;
        this.phoneNumber = phoneNumber;
    }

    int walletId;
    int phoneNumber;

    @Override
    public void processorPayment(double amount) {

    }

    @Override
    public String getPaymentDetails() {
        return null;
    }
}
