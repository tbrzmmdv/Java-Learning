package Lesson20;

public class BankAccount {

    public int balance=0;

    public synchronized void deposit(int deposit){
        balance+=deposit;

        System.out.println("Balansa "+deposit+" manat elave olundu.Balans:"+balance);

    }

    public synchronized void withdraw(int withdraw) {
        if (withdraw > balance) {
            System.out.println("Kifayet qeder vesait yoxdur");
        } else {
            balance -= withdraw;
            System.out.println("Cixxaris Meblegi: " + withdraw + " Balans: " + balance);
        }
    }
}
