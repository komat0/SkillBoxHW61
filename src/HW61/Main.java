package HW61;

public class Main {
    public static void main(String[] args) {

        DepositAccount firstAccount = new DepositAccount(100, "Ivanov");
        firstAccount.getAccountHolder();
        firstAccount.getOriginalAmount();
        firstAccount.withdrawMoney(20);
        firstAccount.getOriginalAmount();
        firstAccount.putMoney(25);
        firstAccount.getOriginalAmount();
        firstAccount.getLastWithdrawDate();
        firstAccount.getAccountCreatedDate();
    }
}