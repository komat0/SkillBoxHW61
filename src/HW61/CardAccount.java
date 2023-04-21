package HW61;

import java.time.LocalDate;

public class CardAccount extends BankAccount {

    public CardAccount(long originalAmount, String accountHolder) {
        super(originalAmount, accountHolder);

    }

    public void withdrawMoney(long amount) {
        if (this.originalAmount >= amount) {
            double percentCounter = (amount * 1.0) / 100.0;
            this.originalAmount -= (amount + percentCounter);
            this.lastWithdrawDate = LocalDate.now();
            System.out.println("Произведено снятие наличных в количестве " +
                    amount + " из них комиссия: " + percentCounter);
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }
}
