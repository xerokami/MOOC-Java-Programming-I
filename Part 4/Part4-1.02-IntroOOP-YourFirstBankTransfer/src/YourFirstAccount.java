public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account firstAccount = new Account("My Account", 0.00);
        Account matthewsAccount = new Account("Matthews account", 1000.00);

        matthewsAccount.withdrawal(100.0);
        firstAccount.deposit(100.00);

        System.out.println(firstAccount);
        System.out.println(matthewsAccount);
    }
}