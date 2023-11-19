
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account account = new Account("Matthews account",1000.00);
        Account account2 = new Account("My account",0.00);
        account.withdrawal(100.00);
        account2.deposit(100.00);
        System.out.println(account);
        System.out.println(account2);
    }
}
