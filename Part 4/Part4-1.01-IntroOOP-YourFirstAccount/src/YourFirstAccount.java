public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account firstAccount = new Account("My Account", 100.00);

        firstAccount.deposit(20);
        System.out.println(firstAccount);
    }
}