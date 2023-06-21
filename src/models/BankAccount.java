package models;

public class BankAccount {
    private static String bankName;

    public BankAccount (String bankAccount){
        this.bankAccount = bankAccount;
    }
    public static void setBankName(String name){
        BankAccount.bankName = name;
    }

    String bankAccount;
    double balance = 0;

    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
    public void getAccountInfo(){
        System.out.println("Account number:" + this.bankAccount + " Balance: " + this.balance + " Bank: " + BankAccount.bankName);
    }
}
