package Lesson20;


class Deposit extends Thread {
    private BankAccount account;
    public int amount;

    public Deposit(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

