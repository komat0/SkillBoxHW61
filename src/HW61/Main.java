package HW61;

public class Main {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount(100, "Ivanov");
        BankAccount secondAccount = new DepositAccount(110, "Petrov");
        BankAccount thirdAccount = new CardAccount(10, "Inochkin");

        firstAccount.getAccountHolder();
        firstAccount.withdrawMoney(20);
        firstAccount.putMoney(25);
        firstAccount.getOriginalAmount();
        firstAccount.getLastWithdrawDate();
        firstAccount.getAccountCreatedDate();
        secondAccount.getAccountHolder();
        secondAccount.withdrawMoney(20);
        secondAccount.putMoney(25);
        secondAccount.getOriginalAmount();
        thirdAccount.getAccountHolder();
        thirdAccount.withdrawMoney(20);
        thirdAccount.putMoney(25);
        thirdAccount.getOriginalAmount();

    }
}