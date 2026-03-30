public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(7.0, "Sawera Ghaffar");
        BankAccount account2 = new BankAccount(1000.0, "Sana Ghaffar");

        account1.deposit(1000.0);
        account1.withdraw(500.0);
        account2.deposit(700.0);
        account2.withdraw(200.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        System.out.println(
                "Final Details of Account 1:" + account1.getAccountHolderName() + " - Balance: "
                        + account1.getBalance());
        System.out.println(
                "Final Details of Account 2:" + account2.getAccountHolderName() + " - Balance: "
                        + account2.getBalance());
    }
}