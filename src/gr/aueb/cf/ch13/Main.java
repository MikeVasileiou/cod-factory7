package gr.aueb.cf.ch13;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "GR123", "Alice", "Wonderwoman", "S123", 1000.0);

        try {
            account.deposit(900);
            System.out.println("Deposit was successful");

            account.withdraw(500, "R132");
            account.withdraw(200, "S123");
            System.out.println("Withdraw successful");

            System.out.println("Balance: " + account.getAccountBalance());

            account.accountToString();


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
