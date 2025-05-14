package Lecture5_OOP.homework1;

public class CreditCard {
    String numberCheck;
    double amountOnAccount;

    public void addSum(double sum) {
        if (sum > 0) {
            amountOnAccount += sum;
            System.out.println("На карточку " + numberCheck + " зачислено: " + sum);
        } else {
            System.out.println("Сумма должна быть больше 0");
        }
    }

    public void takeOffSum(double sum) {
        if (sum > 0 && sum <= amountOnAccount) {
            amountOnAccount -= sum;
            System.out.println("С карточки " + numberCheck + " снято: " + sum);
        } else {
            System.out.println("Недостаточно средств или Сумма должна быть больше 0");
        }
    }

    public void showInfo(String numCard) {
        numberCheck = numCard;
        System.out.println("Номер счета: " + numberCheck + ", Текущий баланс: " + amountOnAccount);
    }
}

