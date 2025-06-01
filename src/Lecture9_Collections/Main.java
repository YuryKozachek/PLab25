package Lecture9_Collections;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setAnimal("Слон");
        animals.setAnimal("Носорог");
        animals.setAnimal("Шираф");
        System.out.println(animals.getAnimals());
        animals.delAnimal();
        animals.setAnimal("Лев");
        System.out.println(animals.getAnimals());
    }
}
