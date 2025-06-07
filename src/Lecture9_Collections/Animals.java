package Lecture9_Collections;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();

    public LinkedList<String> getAnimals() {
        return animals;
    }

    public void setAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void delAnimal() {
        animals.removeLast();
    }
}
