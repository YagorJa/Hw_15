package Task2;

import java.util.LinkedList;
import java.util.List;

public class Animals {
private LinkedList<String> animalList;

    public Animals() {
        this.animalList = new LinkedList<>();
    }

    public LinkedList<String> getAnimalList() {
        return animalList;
    }

    public void addAnimal(String name) {
       animalList.add(0,name);
    }
    public void removeAnimal(){
    animalList.removeLast();
    }
    public void print(){
        for (String animal:animalList) {
            System.out.println(animal + " ");
                   }
    }
}
