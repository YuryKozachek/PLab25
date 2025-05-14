package Lecture5_OOP.homework1;

public class Main {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard();
        CreditCard masterCard = new CreditCard();
        CreditCard mir = new CreditCard();

        visa.showInfo("231232454653653345");
        masterCard.showInfo("2324323245423434");
        mir.showInfo("32432544323243543");

        System.out.println("--------------");

        visa.addSum(100.50);
        masterCard.addSum(505.10);
        mir.takeOffSum(122.55);

        System.out.println("--------------");

        visa.showInfo("231232454653653345");
        masterCard.showInfo("2324325423434");
        mir.showInfo("32432543243543");
    }
}
