package org.example;

import java.util.ArrayList;
import java.util.List;

class Zoo<T extends Animal> {
    private List<T> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public T getAnimal() {
        if (!animals.isEmpty()) {
            return animals.remove(animals.size() - 1);
        }
        return null;
    }
}