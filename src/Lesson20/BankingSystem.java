package Lesson20;

public class BankingSystem {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account=new BankAccount();
        Thread deposit=new Deposit(account,200);
        Thread withdraw1 = new Withdraw(account, 20);
        Thread withdraw2 = new Withdraw(account, 900);

        deposit.start();
        deposit.join();

        withdraw1.start();
        withdraw1.join();

        withdraw2.start();
        withdraw2.join();
    }
}
