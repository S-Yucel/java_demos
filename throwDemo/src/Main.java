public class Main {
    public static void main(String[] args) throws BalanceInsufficientExeption {
        AccountManager manager = new AccountManager();
        System.out.println("Balance " + manager.getBalance() + " €");

        try {
            manager.withdraw(950);
        } catch (BalanceInsufficientExeption exception) {
            System.out.println(exception.getMessage());;
        }

        manager.deposit(100);
        System.out.println("Account " + manager.getBalance() + " €");

        manager.deposit(250);
        System.out.println("Account " + manager.getBalance() + " €");

        try {
            manager.withdraw(950);
        } catch (BalanceInsufficientExeption exception) {
            System.out.println(exception.getMessage());;
        }



        System.out.println("balance " + manager.getBalance() + " €");


    }
}
