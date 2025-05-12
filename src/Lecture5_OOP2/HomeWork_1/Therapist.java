package Lecture5_OOP2.HomeWork_1;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит терапевт");
    }

    public void appointDoctor(String cod) {
        if ("код 1".equalsIgnoreCase(cod)) {
            Surgeon surgeon = new Surgeon();
            System.out.println("Назначаем хирурга");
            surgeon.treat();
        } else if ("код 2".equalsIgnoreCase(cod)) {
            Dentist dentist = new Dentist();
            System.out.println("Назначаем дантиста");
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            System.out.println("Назначаем терапевта");
            therapist.treat();
        }
    }
}
