package Task2;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimal("Zebra");
        animals.addAnimal("Tiger");
        animals.addAnimal("Panda");
        animals.addAnimal("Cat");
        animals.addAnimal("Скунс");
        animals.print();
        animals.removeAnimal();
        System.out.println("\n");
        animals.print();
    }
}
