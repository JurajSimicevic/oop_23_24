package pckg_polymorph;

import java.util.ArrayList;

public class TestAnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSomeSound();
        Tiger tiger = new Tiger();
        tiger.makeSomeSound();
        RubberTiger rubberTiger=new RubberTiger();
        rubberTiger.makeSomeSound();
        // ---------------------------------------------------------------------------------------------
        Animal tiger2 = new Tiger();
        tiger2.makeSomeSound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new RubberTiger());
        for(Animal ani : animals){
            ani.makeSomeSound();
        }
    }
}