package Lesson20;

class Withdraw extends Thread {
    private BankAccount account;
    private int amount;

    public Withdraw(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
