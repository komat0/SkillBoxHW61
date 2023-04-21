package HW61;

import java.time.LocalDate;

public class BankAccount {

    protected long originalAmount;
    private String accountHolder;
    private final LocalDate accountCreatedDate = LocalDate.now();
    LocalDate lastWithdrawDate;

    public BankAccount(long originalAmount, String accountHolder) {
        this.originalAmount = originalAmount;
        this.accountHolder = accountHolder;
    }

    // Метод снятия денег со счета
    public void withdrawMoney(long amount) {
        if (this.originalAmount >= amount) {
            this.originalAmount -= amount;
            lastWithdrawDate = LocalDate.now();
            System.out.println("Произведено снятие наличных в количестве " + amount);
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }

    // Метод пополнения счета
    public void putMoney(long amount) {
        this.originalAmount += amount;
        System.out.println("Счет пополнен на " + amount);
    }

    public void getOriginalAmount() {
        System.out.println("Сумма на счете: " + originalAmount);
    }

    public void setOriginalAmount(long originalAmount) {
        this.originalAmount = originalAmount;
        System.out.println("Cумма на счете: " + originalAmount);
    }

    public void getAccountHolder() {
        System.out.println("Владельцем счета является: " + accountHolder);
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        System.out.println("Владельцем счета теперь является: " + accountHolder);
    }

    public LocalDate getAccountCreatedDate() {
        System.out.println("Счет создан: " + accountCreatedDate);
        return accountCreatedDate;
    }

    public LocalDate getLastWithdrawDate() {
        System.out.println("Деньги снимались последний раз: " + accountCreatedDate);
        return lastWithdrawDate;
    }
}

