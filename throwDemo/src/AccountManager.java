public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficientExeption {
        if (balance>=amount){
        balance = getBalance() - amount;

    } else {
            throw new BalanceInsufficientExeption ("Could not withdraw money from account.\n" +
                    "insufficient balance");
        }

}

    public double getBalance() {
        return balance;
    }
    }
