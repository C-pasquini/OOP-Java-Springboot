import models.BankAccount;

public class Main {
    public static void main (String[] args){
        BankAccount account1 = new BankAccount("AC00001");
        BankAccount account2 = new BankAccount("AC00002");
        BankAccount account3 = new BankAccount("AC00003");
        BankAccount account4 = new BankAccount("AC00004");
        BankAccount.setBankName("Banca d'Italia");

        account1.deposit(5000.24);
        account2.deposit(45000.45);
        account3.deposit(1000.00);
        account4.deposit(150.99);

        account1.getAccountInfo();
        account2.getAccountInfo();
        account3.getAccountInfo();
        account4.getAccountInfo();

        System.out.println("Amount withdrawed: " + account1.withdraw(400.65));
        System.out.println("Amount withdrawed: " + account2.withdraw(50.00));
        System.out.println("Amount withdrawed: " + account3.withdraw(45.50));
        System.out.println("Amount withdrawed: " + account4.withdraw(10.00));

        account1.getAccountInfo();
        account2.getAccountInfo();
        account3.getAccountInfo();
        account4.getAccountInfo();
    }
}
