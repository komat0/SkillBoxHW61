package HW61;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    public DepositAccount(long originalAmount, String accountHolder) {
        super(originalAmount, accountHolder);
    }

    @Override
    public void withdrawMoney(long amount) {
        if (this.originalAmount >= amount) {
            LocalDate currentDate = LocalDate.now();
            LocalDate currentDateMinusMonth = currentDate.minusMonths(1);

            if (currentDate.isBefore(currentDateMinusMonth)) {
                this.withdrawMoney(amount);
            } else {
                System.out.println("Не прошел месяц с даты последнего снятия");
            }
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }
}
