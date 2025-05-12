package Lecture5_OOP2.HomeWork_1;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит дантист");
    }
}
