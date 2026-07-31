package lesson05;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) 
            balance += amt;
    }

    public void withdraw(double amt) {
         if (amt > 0 && amt <= balance)
            balance -= amt;
        else System.out.println("餘額不足");
    }

    public double getBalance() {
        return balance;
    }

    //測試
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("小明", 1000);
        System.out.println("初始餘額: " + acc.getBalance());
        acc.deposit(500);
        System.out.println("存款後餘額: " + acc.getBalance());
        acc.withdraw(200);
        System.out.println("提款後餘額: " + acc.getBalance());
        acc.withdraw(2000); // 測試餘額不足的情況
    }
}    