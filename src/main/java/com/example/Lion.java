package com.example;

import java.util.List;

public class Lion extends Animal {

    boolean hasMane;
    private Predator predator;
    private Feline feline;


    public Lion (Predator predator, Feline feline) {
        this.predator = predator;
        this.feline = feline;
    }

    public Object lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            return hasMane = true;
        } else if ("Самка".equals(sex)) {
            return hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
