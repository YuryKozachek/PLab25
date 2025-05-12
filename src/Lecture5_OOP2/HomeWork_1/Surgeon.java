package Lecture5_OOP2.HomeWork_1;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит хирург");
    }
}
